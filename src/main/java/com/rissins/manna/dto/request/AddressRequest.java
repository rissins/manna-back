package com.rissins.manna.dto.request;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

@Getter
public class AddressRequest {
    String address;

    @Override
    public String toString() {
        return "AddressRequest{" +
                "address='" + address + '\'' +
                '}';
    }
}
