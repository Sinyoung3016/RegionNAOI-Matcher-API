package com.sia.matcher_java_api.dto;

import com.sia.matcher_java_api.domain.Point;
import com.sia.matcher_java_api.payload.request.AreaSaveRequest;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

import java.util.List;

@Getter
@Setter
public class AreaSaveDto {
    private String name;
    private Polygon area;

    public AreaSaveDto(AreaSaveRequest request) {
        this.name = request.getName();
        this.area = list2Polygon(request.getArea());
    }

    private Polygon list2Polygon(List<Point> area) {
        GeometryFactory geometryFactory = new GeometryFactory();
        int lenOfPolygon = area.size();
        Coordinate[] coordinates = new Coordinate[lenOfPolygon + 1];
        for (int i = 0; i < lenOfPolygon; i++) {
            Point point = area.get(i);
            coordinates[i] = new Coordinate(point.getX(), point.getY());
        }
        coordinates[lenOfPolygon] = coordinates[0];
        return geometryFactory.createPolygon(coordinates);
    }
}
