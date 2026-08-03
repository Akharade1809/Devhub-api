package io.devhub.bootstrap

import io.devhub.configuration.loader.ConfigurationLoader
import io.devhub.core.model.ApiInfo
import io.devhub.core.model.HealthResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    val applicationConfig = ConfigurationLoader.load(this)
    routing {
        get("/") {

            call.respond(

                ApiInfo(

                    name = applicationConfig.name,

                    version = applicationConfig.version,

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