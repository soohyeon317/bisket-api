package com.bisket.api.repository;

import com.bisket.api.common.BusinessCategory;
import com.bisket.api.dto.BusinessDto;
import com.bisket.api.dto.PaginationDto;
import com.bisket.api.entity.Business;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import java.util.List;

import static com.bisket.api.entity.QBusiness.business;
import static org.springframework.util.StringUtils.hasText;

public class BusinessRepositoryCustomImpl extends QuerydslRepositorySupport implements BusinessRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    public BusinessRepositoryCustomImpl(EntityManager em) {
        super(Business.class);
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public Page<BusinessDto.BusinessListPageGetResponseDto> findBusinessListPageBySearchConditions(BusinessDto.BusinessListPageGetRequestDto searchConditions) {
        PaginationDto.PaginationRequestDto requestPagination = searchConditions.getRequestPagination();
        int currentPageNumber = requestPagination.getCurrentPageNumber() - 1;
        int pageSize = requestPagination.getPageSize();
        Pageable pageable = PageRequest.of(currentPageNumber, pageSize);
        BooleanBuilder booleanBuilder = new BooleanBuilder();

        // 소재지 주소 조건절
        String siteAddress = searchConditions.getSiteAddress();
        if (hasText(siteAddress)) {
            String[] splitString = siteAddress.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            if (splitString.length >= 3) {
                BooleanBuilder siteAddressBooleanBuilder = new BooleanBuilder();
                for (int i = 0; i < splitString.length; i++) {
                    String appendTargetString = (i == 0) ? splitString[i] : String.format(" %s", splitString[i]);
                    stringBuilder.append(appendTargetString);
                    if (i == 2 || i == 3) {
                        siteAddressBooleanBuilder.or(business.siteFullAddress.startsWith(stringBuilder.toString()));
                    }
                }
                booleanBuilder.and(siteAddressBooleanBuilder);
            } else {
                booleanBuilder.and(business.siteFullAddress.startsWith(siteAddress));
            }
        }

        // 도로명 주소 조건절
        String roadNameAddress = searchConditions.getRoadNameAddress();
        if (hasText(roadNameAddress)) {
            String[] splitString = roadNameAddress.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            if (splitString.length >= 3) {
                BooleanBuilder roadNameAddressBooleanBuilder = new BooleanBuilder();
                for (int i = 0; i < splitString.length; i++) {
                    String appendTargetString = (i == 0) ? splitString[i] : String.format(" %s", splitString[i]);
                    stringBuilder.append(appendTargetString);
                    if (i == 2 || i == 3) {
                        roadNameAddressBooleanBuilder.or(business.roadNameFullAddress.startsWith(stringBuilder.toString()));
                    }
                }
                booleanBuilder.and(roadNameAddressBooleanBuilder);
            } else {
                booleanBuilder.and(business.roadNameFullAddress.startsWith(roadNameAddress));
            }
        }

        // 사업장명 조건절
        String businessPlaceName = searchConditions.getBusinessPlaceName();
        if (hasText(businessPlaceName)) {
            booleanBuilder.and(business.businessPlaceName.startsWith(businessPlaceName));
        }

        // 업체 카테고리명 목록 조건절
        List<BusinessCategory> businessCategoryList = searchConditions.getBusinessCategoryList();
        if (!CollectionUtils.isEmpty(businessCategoryList)) {
            booleanBuilder.and(business.discriminatorType.in(businessCategoryList));
        }

        JPAQuery jpqlQuery = queryFactory
                .select(Projections.fields(BusinessDto.BusinessListPageGetResponseDto.class,
                        business.id,
                        business.businessPlaceName,
                        business.siteFullAddress,
                        business.roadNameFullAddress,
                        business.discriminatorType))
                .from(business)
                .where(booleanBuilder)
                .distinct();

        List<BusinessDto.BusinessListPageGetResponseDto> resultList = getQuerydsl().applyPagination(pageable, jpqlQuery).fetch();

        return new PageImpl(resultList, pageable, jpqlQuery.fetchCount());
    }
}
