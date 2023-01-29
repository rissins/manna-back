package com.rissins.manna.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.List;

@ToString
public class NaverMapGeoCodeResponse {

    @JsonProperty("errorMessage")
    private String errormessage;
    @JsonProperty("addresses")
    private List<AddressesEntity> addresses;
    @JsonProperty("meta")
    private MetaEntity meta;
    @JsonProperty("status")
    private String status;

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public List<AddressesEntity> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressesEntity> addresses) {
        this.addresses = addresses;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class AddressesEntity {
        @JsonProperty("distance")
        private double distance;
        @JsonProperty("y")
        private String y;
        @JsonProperty("x")
        private String x;
        @JsonProperty("addressElements")
        private List<AddressElementsEntity> addresselements;
        @JsonProperty("englishAddress")
        private String englishaddress;
        @JsonProperty("jibunAddress")
        private String jibunaddress;
        @JsonProperty("roadAddress")
        private String roadaddress;

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        public String getY() {
            return y;
        }

        public void setY(String y) {
            this.y = y;
        }

        public String getX() {
            return x;
        }

        public void setX(String x) {
            this.x = x;
        }

        public List<AddressElementsEntity> getAddresselements() {
            return addresselements;
        }

        public void setAddresselements(List<AddressElementsEntity> addresselements) {
            this.addresselements = addresselements;
        }

        public String getEnglishaddress() {
            return englishaddress;
        }

        public void setEnglishaddress(String englishaddress) {
            this.englishaddress = englishaddress;
        }

        public String getJibunaddress() {
            return jibunaddress;
        }

        public void setJibunaddress(String jibunaddress) {
            this.jibunaddress = jibunaddress;
        }

        public String getRoadaddress() {
            return roadaddress;
        }

        public void setRoadaddress(String roadaddress) {
            this.roadaddress = roadaddress;
        }

        @Override
        public String toString() {
            return "AddressesEntity{" +
                    "distance=" + distance +
                    ", y='" + y + '\'' +
                    ", x='" + x + '\'' +
                    ", addresselements=" + addresselements +
                    ", englishaddress='" + englishaddress + '\'' +
                    ", jibunaddress='" + jibunaddress + '\'' +
                    ", roadaddress='" + roadaddress + '\'' +
                    '}';
        }
    }

    public static class AddressElementsEntity {
        @JsonProperty("code")
        private String code;
        @JsonProperty("shortName")
        private String shortname;
        @JsonProperty("longName")
        private String longname;
        @JsonProperty("types")
        private List<String> types;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getShortname() {
            return shortname;
        }

        public void setShortname(String shortname) {
            this.shortname = shortname;
        }

        public String getLongname() {
            return longname;
        }

        public void setLongname(String longname) {
            this.longname = longname;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class MetaEntity {
        @JsonProperty("count")
        private int count;
        @JsonProperty("page")
        private int page;
        @JsonProperty("totalCount")
        private int totalcount;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getTotalcount() {
            return totalcount;
        }

        public void setTotalcount(int totalcount) {
            this.totalcount = totalcount;
        }
    }
}
