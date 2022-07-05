package com.sia.matcher_java_api.service;

import com.sia.matcher_java_api.domain.entity.AOI;
import com.sia.matcher_java_api.dto.AreaReturnDto;
import com.sia.matcher_java_api.dto.AreaSaveDto;
import com.sia.matcher_java_api.respository.AOIRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AOIService {
    private final AOIRepository aoiRepository;

    public AreaReturnDto createNewRegion(AreaSaveDto requestDto) {
        return new AreaReturnDto(aoiRepository.save(new AOI(requestDto)));
    }
}
