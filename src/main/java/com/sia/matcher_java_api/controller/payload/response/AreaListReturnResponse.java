package com.sia.matcher_java_api.payload.response;

import com.sia.matcher_java_api.dto.AreaReturnDto;
import lombok.Getter;
import java.util.List;

@Getter
public class AreaListReturnResponse {
    private List<AreaReturnDto> aois;

    public AreaListReturnResponse(List<AreaReturnDto> areaReturnDtos) {
        this.aois = areaReturnDtos;
    }
}
