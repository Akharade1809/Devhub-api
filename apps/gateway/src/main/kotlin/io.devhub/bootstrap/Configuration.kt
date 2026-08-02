package io.devhub.bootstrap

import io.ktor.server.application.*

fun Application.configureApplication() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}