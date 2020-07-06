package com.mes.priceintelligence.eurekaserver.priceintelligenceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PriceIntelligenceEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PriceIntelligenceEurekaServerApplication.class, args);
    }

}
