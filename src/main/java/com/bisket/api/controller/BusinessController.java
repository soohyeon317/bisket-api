package com.bisket.api.controller;

import com.bisket.api.dto.BusinessDto;
import com.bisket.api.dto.ResponsePageDto;
import com.bisket.api.service.BusinessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/businesses")
public class BusinessController {
    private final BusinessService businessService;

    public BusinessController(BusinessService businessService) {
        this.businessService = businessService;
    }

    @GetMapping
    public ResponsePageDto<List<BusinessDto.BusinessListPageGetResponseDto>> getBusinessListByPage(
            BusinessDto.BusinessListPageGetRequestDto searchConditions
    ) {
        return businessService.getBusinessListByPage(searchConditions);
    }

}
