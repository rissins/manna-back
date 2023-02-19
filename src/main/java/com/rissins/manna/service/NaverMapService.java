package com.rissins.manna.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rissins.manna.dto.request.AddressRequest;
import com.rissins.manna.dto.response.LocationResponse;
import com.rissins.manna.dto.response.NaverMapDirectionsResponse;
import com.rissins.manna.dto.response.NaverMapGeoCodeResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class NaverMapService {

    @Value("${NAVER_MAP_API.CLIENT_ID}")
    private String clientId;

    @Value("${NAVER_MAP_API.CLIENT_SECRET}")
    private String clientSecret;

    public NaverMapDirectionsResponse getNaverMapDirectionsAPI(String start, String goal) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://naveropenapi.apigw.ntruss.com/map-direction/v1/driving?start=" + start + "&goal=" + goal;
        RequestEntity<Void> req = RequestEntity
                .get(fooResourceUrl)
                .header("X-NCP-APIGW-API-KEY-ID", clientId)
                .header("X-NCP-APIGW-API-KEY",clientSecret)
                .build();
        ResponseEntity<String> forEntity = restTemplate.exchange(req, String.class);
        String body = forEntity.getBody();

        ObjectMapper mapper = new ObjectMapper();

//        NaverMapResponse.TrafastEntity trafastEntity = naverMapResponse.getRoute().getTrafast().get(0);

//        int totalDistance = trafastEntity.getSummary().getDistance();

//        List<NaverMapResponse.GuideEntity> guide = trafastEntity.getGuide();
//        int middlePointIndex = (guide.get(guide.size() - 1).getPointindex()) / 2;

//        List<Double> middleCoordinate = trafastEntity.getPath().get(middlePointIndex);
        return mapper.readValue(body, NaverMapDirectionsResponse.class);
    }

    public NaverMapGeoCodeResponse getNaverMapGeoCodeAPI(String address) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + address;
        RequestEntity<Void> req = RequestEntity
                .get(fooResourceUrl)
                .header("X-NCP-APIGW-API-KEY-ID", clientId)
                .header("X-NCP-APIGW-API-KEY", clientSecret)
                .build();
        ResponseEntity<String> forEntity = restTemplate.exchange(req, String.class);
        String body = forEntity.getBody();

        return mapper.readValue(body, NaverMapGeoCodeResponse.class);
    }

    public List<LocationResponse> convertAddressToLocation(List<NaverMapGeoCodeResponse> naverMapGeoCodeResponses) {
        List<LocationResponse> locationResponses = new ArrayList<>();
        List<Double> lats = new ArrayList<>();
        List<Double> lons = new ArrayList<>();

        double mdLon = 0L;
        double mdLat = 0L;

        for (NaverMapGeoCodeResponse naverMapGeoCodeResponse : naverMapGeoCodeResponses) {
            NaverMapGeoCodeResponse.AddressesEntity addressesEntity = naverMapGeoCodeResponse.getAddresses()
                    .stream()
                    .findFirst()
                    .orElse(null);
            assert addressesEntity != null;
            double x = Double.parseDouble(addressesEntity.getX());
            double y = Double.parseDouble(addressesEntity.getY());

            lons.add(x);
            lats.add(y);

            mdLon += x;
            mdLat += y;
        }


        locationResponses.add(
                LocationResponse.builder()
                        .lon(lons)
                        .lat(lats)
                        .mdLon(mdLon / 2 )
                        .mdLat(mdLat / 2 )
                        .build()
        );

        return locationResponses;
    }
}
