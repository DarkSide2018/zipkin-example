package eu.ap.zipkin.zipkin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication



@SpringBootApplication
class ZipkinApplication

fun main(args: Array<String>) {
	runApplication<ZipkinApplication>(*args)
}
