package com.project.apiGateway.controllers;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class SpringCloudGatewayConfig {

    @Bean
    public RouteLocator customGatewayRouting(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(req -> req.path("/employee/**")
                        .uri("lb://SERVICE-ONE"))
                .route(req -> req.path("/customer/**").uri("lb://SERVICE-TWO"))
                .build();

    }
}
