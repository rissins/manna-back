package com.rissins.manna.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NaverMapDirectionsResponse {

    @JsonProperty("route")
    private RouteEntity route;
    @JsonProperty("currentDateTime")
    private String currentdatetime;
    @JsonProperty("message")
    private String message;
    @JsonProperty("code")
    private int code;

    public RouteEntity getRoute() {
        return route;
    }

    public void setRoute(RouteEntity route) {
        this.route = route;
    }

    public String getCurrentdatetime() {
        return currentdatetime;
    }

    public void setCurrentdatetime(String currentdatetime) {
        this.currentdatetime = currentdatetime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class RouteEntity {
        @JsonProperty("trafast")
        private List<TrafastEntity> trafast;

        public List<TrafastEntity> getTrafast() {
            return trafast;
        }

        public void setTrafast(List<TrafastEntity> trafast) {
            this.trafast = trafast;
        }
    }

    public static class TrafastEntity {
        @JsonProperty("guide")
        private List<GuideEntity> guide;
        @JsonProperty("section")
        private List<SectionEntity> section;
        @JsonProperty("path")
        private List<List<Double>> path;
        @JsonProperty("summary")
        private SummaryEntity summary;

        public List<GuideEntity> getGuide() {
            return guide;
        }

        public void setGuide(List<GuideEntity> guide) {
            this.guide = guide;
        }

        public List<SectionEntity> getSection() {
            return section;
        }

        public void setSection(List<SectionEntity> section) {
            this.section = section;
        }

        public List<List<Double>> getPath() {
            return path;
        }

        public void setPath(List<List<Double>> path) {
            this.path = path;
        }

        public SummaryEntity getSummary() {
            return summary;
        }

        public void setSummary(SummaryEntity summary) {
            this.summary = summary;
        }
    }

    public static class GuideEntity {
        @JsonProperty("duration")
        private int duration;
        @JsonProperty("distance")
        private int distance;
        @JsonProperty("instructions")
        private String instructions;
        @JsonProperty("type")
        private int type;
        @JsonProperty("pointIndex")
        private int pointindex;

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public String getInstructions() {
            return instructions;
        }

        public void setInstructions(String instructions) {
            this.instructions = instructions;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getPointindex() {
            return pointindex;
        }

        public void setPointindex(int pointindex) {
            this.pointindex = pointindex;
        }
    }

    public static class SectionEntity {
        @JsonProperty("speed")
        private int speed;
        @JsonProperty("congestion")
        private int congestion;
        @JsonProperty("name")
        private String name;
        @JsonProperty("distance")
        private int distance;
        @JsonProperty("pointCount")
        private int pointcount;
        @JsonProperty("pointIndex")
        private int pointindex;

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getCongestion() {
            return congestion;
        }

        public void setCongestion(int congestion) {
            this.congestion = congestion;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public int getPointcount() {
            return pointcount;
        }

        public void setPointcount(int pointcount) {
            this.pointcount = pointcount;
        }

        public int getPointindex() {
            return pointindex;
        }

        public void setPointindex(int pointindex) {
            this.pointindex = pointindex;
        }
    }

    public static class SummaryEntity {
        @JsonProperty("fuelPrice")
        private int fuelprice;
        @JsonProperty("taxiFare")
        private int taxifare;
        @JsonProperty("tollFare")
        private int tollfare;
        @JsonProperty("bbox")
        private List<List<Double>> bbox;
        @JsonProperty("departureTime")
        private String departuretime;
        @JsonProperty("etaServiceType")
        private int etaservicetype;
        @JsonProperty("duration")
        private int duration;
        @JsonProperty("distance")
        private int distance;
        @JsonProperty("goal")
        private GoalEntity goal;
        @JsonProperty("start")
        private StartEntity start;

        public int getFuelprice() {
            return fuelprice;
        }

        public void setFuelprice(int fuelprice) {
            this.fuelprice = fuelprice;
        }

        public int getTaxifare() {
            return taxifare;
        }

        public void setTaxifare(int taxifare) {
            this.taxifare = taxifare;
        }

        public int getTollfare() {
            return tollfare;
        }

        public void setTollfare(int tollfare) {
            this.tollfare = tollfare;
        }

        public List<List<Double>> getBbox() {
            return bbox;
        }

        public void setBbox(List<List<Double>> bbox) {
            this.bbox = bbox;
        }

        public String getDeparturetime() {
            return departuretime;
        }

        public void setDeparturetime(String departuretime) {
            this.departuretime = departuretime;
        }

        public int getEtaservicetype() {
            return etaservicetype;
        }

        public void setEtaservicetype(int etaservicetype) {
            this.etaservicetype = etaservicetype;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }

        public GoalEntity getGoal() {
            return goal;
        }

        public void setGoal(GoalEntity goal) {
            this.goal = goal;
        }

        public StartEntity getStart() {
            return start;
        }

        public void setStart(StartEntity start) {
            this.start = start;
        }
    }

    public static class GoalEntity {
        @JsonProperty("dir")
        private int dir;
        @JsonProperty("location")
        private List<Double> location;

        public int getDir() {
            return dir;
        }

        public void setDir(int dir) {
            this.dir = dir;
        }

        public List<Double> getLocation() {
            return location;
        }

        public void setLocation(List<Double> location) {
            this.location = location;
        }
    }

    public static class StartEntity {
        @JsonProperty("location")
        private List<Double> location;

        public List<Double> getLocation() {
            return location;
        }

        public void setLocation(List<Double> location) {
            this.location = location;
        }
    }


    @Override
    public String toString() {
        return "NaverMapResponse{" +
                "route=" + route +
                ", currentdatetime='" + currentdatetime + '\'' +
                ", message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
