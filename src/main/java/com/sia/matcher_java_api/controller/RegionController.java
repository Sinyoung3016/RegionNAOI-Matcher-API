package com.sia.matcher_java_api.controller;

import com.sia.matcher_java_api.dto.AreaReturnDto;
import com.sia.matcher_java_api.dto.AreaSaveDto;
import com.sia.matcher_java_api.exception.custom.IdNotFoundException;
import com.sia.matcher_java_api.payload.request.AreaSaveRequest;
import com.sia.matcher_java_api.payload.response.AreaListReturnResponse;
import com.sia.matcher_java_api.payload.response.AreaSaveResponse;
import com.sia.matcher_java_api.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/regions")
public class RegionController {
    private final RegionService regionService;

    @PostMapping
    public ResponseEntity<AreaSaveResponse> postRegion(@RequestBody AreaSaveRequest request) {
        AreaReturnDto returnRegion = regionService.createNewRegion(new AreaSaveDto(request));
        return ResponseEntity.ok(new AreaSaveResponse(returnRegion));
    }

    @GetMapping("/{region-id}/aois/intersects")
    public ResponseEntity<AreaListReturnResponse> getAOIListInThisRegion(@PathVariable("region-id") String regionId_) {
        Long regionId = Long.parseLong(regionId_);
        if (!regionService.hasRegionId(regionId))
            throw new IdNotFoundException();
        List<AreaReturnDto> returnAOIList = regionService.readAllAOIInThisRegion(regionId);
        return ResponseEntity.ok(new AreaListReturnResponse(returnAOIList));
    }
}
