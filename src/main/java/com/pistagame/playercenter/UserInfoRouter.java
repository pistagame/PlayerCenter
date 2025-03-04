package com.pistagame.playercenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class UserInfoRouter {
    @Autowired
    private UserInfoHandler userInfoHandler;
    @Bean
    public RouterFunction<ServerResponse> getString() {
        return route(GET("/"), req->userInfoHandler.getUserInfo(req));
    }
}
