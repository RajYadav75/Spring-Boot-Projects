package com.baba.SecondSpringBootProject.service;

import com.baba.SecondSpringBootProject.component.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class App {
    @Autowired
    @Qualifier("PE")
    Engine engine;
    public void drive()
    {
        int start = engine.start();
        if (start>=1)
            System.out.println("Engine Started........");
        else
            System.out.println("Engine not started in else part........");
    }
}
