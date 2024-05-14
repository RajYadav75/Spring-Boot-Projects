package com.spark.FirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/baba")
public class FirstController
{
    @GetMapping("/raj")
    public String kaiseHo()
    {
        return "Mai ek number hu bhai log..........";
    }
}
