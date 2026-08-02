package io.devhub.bootstrap

import io.devhub.core.model.ApiInfo
import io.devhub.core.model.HealthResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {

        get("/") {

            call.respond(

                ApiInfo(

                    name = "DevHub API",

                    version = "0.0.1",

                    status = "running"

                )

            )

        }

        get("/health") {

            call.respond(

                HealthResponse("UP")

            )

        }

    }

}