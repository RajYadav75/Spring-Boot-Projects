package com.covid.app.CovidApp.controller;

import com.covid.app.CovidApp.service.CovidDataServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid-data")
public class CovidController {
    @Autowired
    CovidDataServices covidDataServices;
    //localhost:8080/covid-data/citywise/delhi

    @GetMapping("/citywise/{city}")
    public String getCovidCases(@PathVariable String city)
    {
        Integer covidData = covidDataServices.getCovidData(city);
//        System.out.println(city);
        return "Covid active case in "+city+ " ="+covidData;
    }
}
