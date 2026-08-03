package io.devhub.configuration.loader

import io.devhub.configuration.model.ApplicationConfiguration
import io.ktor.server.application.*

object ConfigurationLoader{
    fun load(application : Application) : ApplicationConfiguration {
        val config = application.environment.config

        return ApplicationConfiguration(
            name = config.property("devhub.application.name").getString(),
            version = config.property("devhub.application.version").getString(),
            environment = config.property("devhub.application.environment").getString(),
        )
    }
}