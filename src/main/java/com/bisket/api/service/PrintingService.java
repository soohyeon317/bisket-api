package com.bisket.api.service;

import com.bisket.api.repository.PrintingRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class PrintingService implements BusinessBaseService {
    private final PrintingRepository printingRepository;

    public PrintingService(PrintingRepository printingRepository) {
        this.printingRepository = printingRepository;
    }

    @Override
    public Object getOne(Long id) {
        return printingRepository.getOne(id);
    }
}
