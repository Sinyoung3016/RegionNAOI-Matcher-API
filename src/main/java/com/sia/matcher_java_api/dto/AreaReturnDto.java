package com.sia.matcher_java_api.dto;

import com.sia.matcher_java_api.domain.Point;
import com.sia.matcher_java_api.domain.entity.Area;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Polygon;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AreaReturnDto {
    private Long id;
    private String name;
    private List<Point> area;

    public AreaReturnDto(Area area) {
        this.id = area.getId();
        this.name = area.getName();
        this.area = polygon2List(area.getArea());
    }

    private List<Point> polygon2List(Polygon polygon) {
        List<Point> points = new ArrayList<>();
        Coordinate[] coordinates = polygon.getCoordinates();
        for (Coordinate coordinate : coordinates) {
            points.add(new Point(coordinate.getX(), coordinate.getY()));
        }
        return points;
    }
}
