package com.bisket.api.dto;

import com.bisket.api.common.BusinessCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class BusinessDto {
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BusinessListPageGetRequestDto {
        // 요청 페이지 정보
        private PaginationDto.PaginationRequestDto requestPagination = new PaginationDto.PaginationRequestDto();
        // 소재지 주소
        private String siteAddress;
        // 도로명 주소
        private String roadNameAddress;
        // 사업장명
        private String businessPlaceName;
        // 업체 카테고리명 목록
        private List<BusinessCategory> businessCategoryNameList;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BusinessListPageGetResponseDto {
        private String businessPlaceName;
    }
}
