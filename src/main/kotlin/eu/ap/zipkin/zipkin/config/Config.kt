package eu.ap.zipkin.zipkin.config

import brave.sampler.Sampler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class Config {
    @Bean
    fun alwaysSampler(): Sampler? {
        return Sampler.ALWAYS_SAMPLE
    }
}