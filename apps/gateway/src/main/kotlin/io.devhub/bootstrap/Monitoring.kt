package io.devhub.bootstrap

import io.ktor.server.application.*

fun Application.configureMonitoring() {

    environment.log.info("🚀 DevHub API starting...")

}