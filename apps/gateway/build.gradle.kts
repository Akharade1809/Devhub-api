plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ktor)
    application
}

application {
    mainClass.set("io.devhub.ApplicationKt")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(project(":libraries:contracts"))
    implementation(project(":libraries:configuration"))

    implementation("io.ktor:ktor-server-config-yaml")


    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)

    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.serialization)

    implementation(libs.koin.ktor)

    implementation(libs.logback)
}