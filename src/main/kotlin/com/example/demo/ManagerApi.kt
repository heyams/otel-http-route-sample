package com.example.demo

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class ManagerApi {

    fun getInstance(req: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok()
            .bodyValue("Getting instance")
}
