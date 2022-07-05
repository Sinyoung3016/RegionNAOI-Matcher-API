package com.sia.matcher_java_api.domain.entity;

import com.sia.matcher_java_api.dto.AreaSaveDto;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Polygon;
import javax.persistence.*;

@Data
@MappedSuperclass
@NoArgsConstructor
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(length = 20, nullable = false)
    protected String name;

    @Column(nullable = false, columnDefinition="geometry")
    protected Polygon area;

    public Area(AreaSaveDto requestDto) {
        this.name = requestDto.getName();
        this.area = requestDto.getArea();
    }
}
