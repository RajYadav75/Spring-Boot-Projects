package com.covid.app.CovidApp.service;

import com.covid.app.CovidApp.utility.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class CovidDataServices {
    @Autowired
    RestTemplate restTemplate;
    public Integer getCovidData(String cityName){
        
        Map<String,Object> map = restTemplate.getForObject(Util.COVID_DATA_API, Map.class);
        Map<String,Object> cityObjectMap = (Map<String, Object>) map.get(cityName);
        Map<String,Object> districtData = (Map<String, Object>) cityObjectMap.get("districtData");
        Map<String,Object> city = (Map<String, Object>) districtData.get(cityName);;
        Integer active =(Integer) city.get("active");
        return active;
    }
}
