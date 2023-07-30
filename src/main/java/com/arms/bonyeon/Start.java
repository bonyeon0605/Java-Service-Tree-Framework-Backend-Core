package com.arms.bonyeon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Start() {
        logger.info("start bonyeon...");
    }


    public void Test() {
        logger.info("eafewafewf");
    }
}
