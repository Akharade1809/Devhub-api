package io.devhub.configuration.di

import io.devhub.configuration.loader.ConfigurationLoader
import io.devhub.configuration.model.ApplicationConfiguration
import io.ktor.server.application.*
import org.koin.dsl.module

val configurationModule = module {
    single<ApplicationConfiguration> { ConfigurationLoader.load(get<Application>()) }
}