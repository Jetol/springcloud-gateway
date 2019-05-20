/*
package com.xieluyang.spring4allgateway1.route;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Spring Cloud Gateway可以使用kotlin自定义路由：
@Configuration
class AdditionalRoutes {

    @Bean
    fun additionalRouteLocator(builder:RouteLocatorBuilder): RouteLocator = builder.routes {
        route(id = "test-kotlin") {
            path("/image/png")
            filters {
                addResponseHeader("X-TestHeader", "foobar")
            }
            uri("http://httpbin.org:80")
        }
    }
}
*/
