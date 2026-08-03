package io.devhub.configuration.model

data class ApplicationConfiguration(
    val name: String,
    val version: String,
    val environment: String
)