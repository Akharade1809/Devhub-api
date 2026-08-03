package io.devhub

import io.devhub.bootstrap.configureApplication
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args : Array<String>) {
    EngineMain.main(args = args)
}

fun Application.module(){
    configureApplication()
}