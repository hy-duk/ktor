package com.hyduk

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.hyduk.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureSerialization()
    }.start(wait = true)
}
