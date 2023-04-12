package com.example.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class Router {

    @Bean
    fun managerRouter(managerApi: ManagerApi): RouterFunction<ServerResponse> = router {
        "/api".nest {
            "/accounts".nest {
                accept(MediaType.APPLICATION_JSON).nest {
                    GET("/{id:[A-Z|0-9|\\-]+}", managerApi::getInstance)
                }
            }
        }
    }
}
