package com.bisket.api.service;

import com.bisket.api.common.BusinessCategory;
import com.bisket.api.dto.BusinessDto;
import com.bisket.api.dto.ResponseDto;
import com.bisket.api.dto.ResponsePageDto;
import com.bisket.api.repository.BusinessRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@Slf4j
public class BusinessService {
    private final BusinessRepository businessRepository;

    private final BusinessServiceFactory businessServiceFactory;
    private final ModelMapper modelMapper;

    public BusinessService(BusinessRepository businessRepository, BusinessServiceFactory businessServiceFactory, ModelMapper modelMapper) {
        this.businessRepository = businessRepository;
        this.businessServiceFactory = businessServiceFactory;
        this.modelMapper = modelMapper;
    }

    /**
     * 검색조건을 만족하는 업체 목록을 페이지 단위로 조회한다
     */
    public ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>> getBusinessListByPage(
            BusinessDto.BusinessListPageGetRequestDto searchConditions
    ) {
        log.info("getBusinessListByPage() Invocation!!");

        ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>> response = new ResponsePageDto<>();
        Page<BusinessDto.BusinessListPageGetResponseDto> businessListPage = businessRepository.findBusinessListPageBySearchConditions(searchConditions);

        // ResponseDto 세팅
        response.setData(businessListPage.getContent());
        response.getPagination().setPageCount(businessListPage.getTotalPages());
        response.getPagination().setCurrentPageNumber(businessListPage.getPageable().getPageNumber() + 1);
        response.getPagination().setDataCount(businessListPage.getTotalElements());

        return response;
    }

    /**
     * 한 업체의 상세정보를 조회한다
     */
    public ResponseDto<BusinessDto.BusinessGetResponseDto> getOneBusinessDetail(Long id, BusinessCategory businessCategory) {
        log.info("getOneBusiness() Invocation!!");

        ResponseDto<BusinessDto.BusinessGetResponseDto> response = new ResponseDto<>();
        BusinessBaseService businessBaseService =
                businessServiceFactory.getOneBusinessCategoryService(businessCategory);
        Object businessDetail = businessBaseService.getOne(id);
        BusinessDto.BusinessGetResponseDto businessGetResponseDto = new BusinessDto.BusinessGetResponseDto();
        modelMapper.map(businessDetail, businessGetResponseDto);

        // ResponseDto 세팅
        response.setData(businessGetResponseDto);

        return response;
    }
}
