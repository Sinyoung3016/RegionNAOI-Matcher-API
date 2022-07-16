package com.sia.matcher_java_api.payload.response;

import com.sia.matcher_java_api.dto.AreaReturnDto;
import lombok.Getter;

@Getter
public class AreaSaveResponse {
    private Long id;

    public AreaSaveResponse(AreaReturnDto returnDto){
        this.id = returnDto.getId();
    }
}
