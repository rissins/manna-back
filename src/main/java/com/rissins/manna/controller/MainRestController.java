package com.rissins.manna.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rissins.manna.dto.request.AddressRequest;
import com.rissins.manna.dto.request.LocationRequest;
import com.rissins.manna.dto.response.LocationResponse;
import com.rissins.manna.dto.response.NaverMapGeoCodeResponse;
import com.rissins.manna.service.NaverMapService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainRestController {

    private final NaverMapService naverMapService;

    @PostMapping("/test")
    public List<AddressRequest> test(@RequestBody List<AddressRequest> addressRequests) {
        List<NaverMapGeoCodeResponse> naverMapGeoCodeResponses = addressRequests.stream()
                .map(addressRequest -> {
                    try {
                        return naverMapService.getNaverMapGeoCodeAPI(addressRequest.getAddress());
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).collect(Collectors.toList());

        List<LocationResponse> locationResponses = naverMapService.convertAddressToLocation(naverMapGeoCodeResponses);

        log.info("변환된 좌표 : {}", locationResponses.toString());


//        naverMapService.getNaverMapDirectionsAPI()

        log.info("호출완료");
        return addressRequests;
    }
}
