package com.sia.matcher_java_api.controller;

import com.sia.matcher_java_api.dto.AreaReturnDto;
import com.sia.matcher_java_api.dto.AreaSaveDto;
import com.sia.matcher_java_api.payload.request.AreaSaveRequest;
import com.sia.matcher_java_api.payload.response.AreaSaveResponse;
import com.sia.matcher_java_api.service.AOIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aois")
public class AOIController {
    private final AOIService aoiService;

    @PostMapping
    public ResponseEntity<AreaSaveResponse> postAOI(@RequestBody AreaSaveRequest request) {
        AreaReturnDto returnAOI = aoiService.createNewRegion(new AreaSaveDto(request));
        return ResponseEntity.ok(new AreaSaveResponse(returnAOI));
    }

    //@GetMapping
    //public ResponseEntity<AreaReturnResponse> getNearAOIFromThisPoint(
    //        @RequestParam(value = "lat") String lat_,
    //        @RequestParam(value = "long") String long_) {
    //    Double lat = Double.valueOf(lat_);
    //    Double lon = Double.valueOf(long_);
    //    AreaReturnDto returnAOI = aoiService.readNearAOIFrom(lat, lon);
    //   return ResponseEntity.ok(new AreaReturnResponse(returnAOI));
    //}
}
