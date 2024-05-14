package com.baba.SecondSpringBootProject.controller;

import com.baba.SecondSpringBootProject.service.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // for denoting it as rest contoller
@RequestMapping("engine") // for giving end point
public class EngineController {
    @Autowired

    App app;
    @GetMapping("/chechEngine")
    public void checkEngine()
    {
        app.drive();
    }
}
