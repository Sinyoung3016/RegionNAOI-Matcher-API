package com.sia.matcher_java_api.service;

import com.sia.matcher_java_api.domain.entity.AOI;
import com.sia.matcher_java_api.domain.entity.Region;
import com.sia.matcher_java_api.dto.AreaReturnDto;
import com.sia.matcher_java_api.dto.AreaSaveDto;
import com.sia.matcher_java_api.respository.AOIRepository;
import com.sia.matcher_java_api.respository.RegionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RegionService {
    private final RegionRepository regionRepository;
    private final AOIRepository aoiRepository;

    public AreaReturnDto createNewRegion(AreaSaveDto requestDto) {
        return new AreaReturnDto(regionRepository.save(new Region(requestDto)));
    }
    }
}
