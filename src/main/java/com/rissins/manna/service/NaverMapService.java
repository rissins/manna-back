package com.rissins.manna.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rissins.manna.dto.response.Test;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class NaverMapService {

    public void getNaverMapAPI() throws ParseException {
//        RestTemplate restTemplate = new RestTemplate();
//        String fooResourceUrl = "https://5nft.link/crawling/data";
//        RequestEntity<Void> req = RequestEntity
//                .get(fooResourceUrl)
////                .header("X-Naver-Client-Id", "PSzb2MSWCkRSTX3nMKXs")
////                .header("X-Naver-Client-Secret","비밀번호")
//                .build();
//        ResponseEntity<String> forEntity = restTemplate.exchange(req, String.class);
//        String body = forEntity.getBody();

        String testBody = "{\n" +
                "  \"code\": 0,\n" +
                "  \"message\": \"길찾기를 성공하였습니다.\",\n" +
                "  \"currentDateTime\": \"2023-01-27T12:37:38\",\n" +
                "  \"route\": {\n" +
                "    \"trafast\": [\n" +
                "      {\n" +
                "        \"summary\": {\n" +
                "          \"start\": {\n" +
                "            \"location\": [\n" +
                "              129.0439087,\n" +
                "              35.0918712\n" +
                "            ]\n" +
                "          },\n" +
                "          \"goal\": {\n" +
                "            \"location\": [\n" +
                "              129.0339272,\n" +
                "              35.0978882\n" +
                "            ],\n" +
                "            \"dir\": 1\n" +
                "          },\n" +
                "          \"distance\": 1537,\n" +
                "          \"duration\": 351477,\n" +
                "          \"etaServiceType\": 0,\n" +
                "          \"departureTime\": \"2023-01-27T12:37:38\",\n" +
                "          \"bbox\": [\n" +
                "            [\n" +
                "              129.0339272,\n" +
                "              35.0907335\n" +
                "            ],\n" +
                "            [\n" +
                "              129.0441106,\n" +
                "              35.0981537\n" +
                "            ]\n" +
                "          ],\n" +
                "          \"tollFare\": 0,\n" +
                "          \"taxiFare\": 3800,\n" +
                "          \"fuelPrice\": 172\n" +
                "        },\n" +
                "        \"path\": [\n" +
                "          [\n" +
                "            129.0438383,\n" +
                "            35.0917459\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0439810,\n" +
                "            35.0916918\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0440420,\n" +
                "            35.0916676\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0441106,\n" +
                "            35.0916406\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0440718,\n" +
                "            35.0915626\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0440106,\n" +
                "            35.0914561\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0438654,\n" +
                "            35.0912019\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0436973,\n" +
                "            35.0908975\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0436893,\n" +
                "            35.0908795\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0436710,\n" +
                "            35.0908428\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0436130,\n" +
                "            35.0907335\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0434629,\n" +
                "            35.0908013\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0433661,\n" +
                "            35.0908449\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0430665,\n" +
                "            35.0909542\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0423943,\n" +
                "            35.0911972\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0423779,\n" +
                "            35.0912028\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0423627,\n" +
                "            35.0912084\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0422832,\n" +
                "            35.0912401\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0418147,\n" +
                "            35.0914110\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0416066,\n" +
                "            35.0914849\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0415685,\n" +
                "            35.0914989\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0413636,\n" +
                "            35.0915709\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0412622,\n" +
                "            35.0916065\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0407187,\n" +
                "            35.0918126\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0403113,\n" +
                "            35.0919612\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0401653,\n" +
                "            35.0920144\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0400488,\n" +
                "            35.0920628\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0399704,\n" +
                "            35.0920944\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0396895,\n" +
                "            35.0922044\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0394129,\n" +
                "            35.0923143\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0391098,\n" +
                "            35.0924137\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0390608,\n" +
                "            35.0924297\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0384853,\n" +
                "            35.0926281\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0383119,\n" +
                "            35.0926853\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0381431,\n" +
                "            35.0927506\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0377706,\n" +
                "            35.0928923\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0374275,\n" +
                "            35.0930238\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0373831,\n" +
                "            35.0930541\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0373466,\n" +
                "            35.0930943\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0371938,\n" +
                "            35.0934884\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0371614,\n" +
                "            35.0935745\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0370248,\n" +
                "            35.0939495\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0368799,\n" +
                "            35.0943534\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0368477,\n" +
                "            35.0944494\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0368154,\n" +
                "            35.0945418\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0367852,\n" +
                "            35.0946296\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0363689,\n" +
                "            35.0958269\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0361150,\n" +
                "            35.0965586\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0360962,\n" +
                "            35.0966138\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0360164,\n" +
                "            35.0968610\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0359313,\n" +
                "            35.0971199\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0357431,\n" +
                "            35.0976741\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0357317,\n" +
                "            35.0977076\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0356188,\n" +
                "            35.0980066\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0355338,\n" +
                "            35.0981537\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0354271,\n" +
                "            35.0980793\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0353739,\n" +
                "            35.0980493\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0353441,\n" +
                "            35.0980398\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0352999,\n" +
                "            35.0980241\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0351007,\n" +
                "            35.0979870\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0349795,\n" +
                "            35.0979606\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0345399,\n" +
                "            35.0978615\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0339447,\n" +
                "            35.0977140\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0339963,\n" +
                "            35.0978296\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0340115,\n" +
                "            35.0978826\n" +
                "          ],\n" +
                "          [\n" +
                "            129.0339374,\n" +
                "            35.0979079\n" +
                "          ]\n" +
                "        ],\n" +
                "        \"section\": [\n" +
                "          {\n" +
                "            \"pointIndex\": 0,\n" +
                "            \"pointCount\": 4,\n" +
                "            \"distance\": 27,\n" +
                "            \"name\": \"절영로13번길\",\n" +
                "            \"congestion\": 3,\n" +
                "            \"speed\": 7\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 3,\n" +
                "            \"pointCount\": 52,\n" +
                "            \"distance\": 1328,\n" +
                "            \"name\": \"태종로\",\n" +
                "            \"congestion\": 3,\n" +
                "            \"speed\": 15\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 54,\n" +
                "            \"pointCount\": 9,\n" +
                "            \"distance\": 155,\n" +
                "            \"name\": \"구덕로\",\n" +
                "            \"congestion\": 2,\n" +
                "            \"speed\": 34\n" +
                "          }\n" +
                "        ],\n" +
                "        \"guide\": [\n" +
                "          {\n" +
                "            \"pointIndex\": 3,\n" +
                "            \"type\": 3,\n" +
                "            \"instructions\": \"'태종로' 방면으로 우회전\",\n" +
                "            \"distance\": 27,\n" +
                "            \"duration\": 13885\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 10,\n" +
                "            \"type\": 3,\n" +
                "            \"instructions\": \"소방서앞사거리에서 '부산역' 방면으로 우회전\",\n" +
                "            \"distance\": 111,\n" +
                "            \"duration\": 28541\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 54,\n" +
                "            \"type\": 2,\n" +
                "            \"instructions\": \"옛시청교차로에서 '자갈치' 방면으로 좌회전\",\n" +
                "            \"distance\": 1217,\n" +
                "            \"duration\": 284979\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 62,\n" +
                "            \"type\": 3,\n" +
                "            \"instructions\": \"'남포길' 방면으로 우회전\",\n" +
                "            \"distance\": 155,\n" +
                "            \"duration\": 16411\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 64,\n" +
                "            \"type\": 2,\n" +
                "            \"instructions\": \"좌회전\",\n" +
                "            \"distance\": 20,\n" +
                "            \"duration\": 5142\n" +
                "          },\n" +
                "          {\n" +
                "            \"pointIndex\": 65,\n" +
                "            \"type\": 88,\n" +
                "            \"instructions\": \"목적지\",\n" +
                "            \"distance\": 7,\n" +
                "            \"duration\": 2519\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
//        System.out.println("testBody = " + testBody);

        JSONParser parser = new JSONParser();
        JSONObject testBodyJsonObject = (JSONObject) parser.parse(testBody);
        JSONObject routeJsonObject = (JSONObject) testBodyJsonObject.get("route");
        JSONArray trafastJsonArray = (JSONArray) routeJsonObject.get("trafast");
        JSONObject trafastJsonObject = (JSONObject) trafastJsonArray.get(0);
        JSONObject summaryJsonObject = (JSONObject) trafastJsonObject.get("summary");

        //총 거리
        Long distance = (Long) summaryJsonObject.get("distance");
        System.out.println("distanceJsonObject = " + distance);

        JSONArray guideJsonArray = (JSONArray) trafastJsonObject.get("guide");
        JSONObject guideLastIndexJsonObjectOfJsonArray = (JSONObject) guideJsonArray.get(guideJsonArray.size() - 1);

        //총 Index
        Long pointIndex = (Long) guideLastIndexJsonObjectOfJsonArray.get("pointIndex");
        long halfPointIndex = pointIndex / 2;
        int intTypeOHalfPointIndex = Long.valueOf(halfPointIndex).intValue();

        JSONArray pathJsonArray = (JSONArray) trafastJsonObject.get("path");
        Object o = pathJsonArray.get(intTypeOHalfPointIndex);
        System.out.println("o = " + o);
        System.out.println("intTypeOHalfPointIndex = " + intTypeOHalfPointIndex);
    }

    public static void main(String[] args) throws ParseException {
        NaverMapService naverMapService = new NaverMapService();
        naverMapService.getNaverMapAPI();
    }
}
