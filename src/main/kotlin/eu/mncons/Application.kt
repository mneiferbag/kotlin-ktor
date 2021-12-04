package eu.mncons

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import eu.mncons.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureAdministration()
    }.start(wait = true)
}
