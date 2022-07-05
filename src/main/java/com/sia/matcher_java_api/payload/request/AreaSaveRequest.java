package com.sia.matcher_java_api.payload.request;

import com.sia.matcher_java_api.domain.Point;
import lombok.Getter;
import java.util.List;

@Getter
public class AreaSaveRequest {
    private String name;
    private List<Point> area;
}
