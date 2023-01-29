package com.rissins.manna.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LocationResponse {
    double lat;
    double lon;
    double middlePoint;
}
