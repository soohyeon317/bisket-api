package com.bisket.api.service;

import com.bisket.api.common.Commons.*;
import com.bisket.api.dto.BusinessDto;
import com.bisket.api.dto.ResponsePageDto;
import com.bisket.api.repository.BusinessRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BusinessService {
    private final BusinessRepository businessRepository;

    public BusinessService(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    /**
     * 검색조건을 만족하는 업체 목록을 페이지 단위로 조회한다
     */
    public ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>> getBusinessListByPage(
            BusinessDto.BusinessListPageGetRequestDto searchConditions
    ) {
        log.info("getBusinessListByPage() Call");
        ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>> response = new ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>>();
        Page<BusinessDto.BusinessListPageGetResponseDto> businessListPage = null;
        try {
            businessListPage = businessRepository.findBusinessListPageBySearchConditions(searchConditions);
        } catch (Exception e) {
            log.error("getBusinessListByPage() Error\n{}", e);
            return response;
        }

        // ResponseDto 세팅
        response.setResult(ApiResponseResult.SUCCESS);
        response.setData(businessListPage.getContent());
        response.getPagination().setPageCount(businessListPage.getTotalPages());
        response.getPagination().setCurrentPageNumber(businessListPage.getPageable().getPageNumber() + 1);

        return response;
    }
}
