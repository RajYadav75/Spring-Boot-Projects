package com.baba.SecondSpringBootProject.component;

import org.springframework.stereotype.Component;

@Component
public class PE implements Engine{
    @Override
    public int start() {
        return 1;
    }
}
