package com.sia.matcher_java_api.domain.entity;

import com.sia.matcher_java_api.dto.AreaSaveDto;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Region extends Area{
    public Region(AreaSaveDto requestDto){
        super(requestDto);
    }
}
