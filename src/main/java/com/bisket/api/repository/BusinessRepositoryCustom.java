package com.bisket.api.repository;

import com.bisket.api.dto.BusinessDto;
import org.springframework.data.domain.Page;

public interface BusinessRepositoryCustom {
    Page<BusinessDto.BusinessListPageGetResponseDto> findBusinessListPageBySearchConditions(BusinessDto.BusinessListPageGetRequestDto searchConditions);
}
