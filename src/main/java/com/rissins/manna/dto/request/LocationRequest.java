package com.rissins.manna.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LocationRequest {

    int lat;
    int lon;
}
