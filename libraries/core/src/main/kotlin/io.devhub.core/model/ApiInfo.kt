package io.devhub.core.model

import kotlinx.serialization.Serializable

@Serializable
data class ApiInfo(

    val name: String,

    val version: String,

    val status: String

)