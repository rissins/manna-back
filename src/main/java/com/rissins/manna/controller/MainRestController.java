package com.rissins.manna.controller;

import com.rissins.manna.dto.request.LocationRequest;
import com.rissins.manna.dto.response.LocationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Slf4j
@CrossOrigin
public class MainRestController {

    @PostMapping("/test")
    public LocationRequest test(@RequestBody LocationRequest locationRequest) {
        log.info("호출완료");
        log.info("Load Request = {}, {}", locationRequest.getLat(), locationRequest.getLon());
        return locationRequest;
    }
}
