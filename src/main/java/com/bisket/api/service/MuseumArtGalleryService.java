package com.bisket.api.service;

import com.bisket.api.repository.MuseumArtGalleryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@Slf4j
public class MuseumArtGalleryService implements BusinessBaseService {
    private final MuseumArtGalleryRepository museumArtGalleryRepository;

    public MuseumArtGalleryService(MuseumArtGalleryRepository museumArtGalleryRepository) {
        this.museumArtGalleryRepository = museumArtGalleryRepository;
    }

    @Override
    public Object getOne(Long id) {
        return museumArtGalleryRepository.getOne(id);
    }
}
