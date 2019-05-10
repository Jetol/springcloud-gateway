package com.xieluyang.gatewaylimiter.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class UriKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        String path = exchange.getRequest().getURI().getPath();
        System.out.println("path:"+path);
        return Mono.just(path);
    }

}
