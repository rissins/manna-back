package com.rissins.manna.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LocationResponse {
    List<Double> lat;
    List<Double> lon;
    double mdLat;
    double mdLon;
}
