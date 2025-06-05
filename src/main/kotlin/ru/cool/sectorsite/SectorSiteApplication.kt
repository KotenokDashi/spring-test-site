package ru.cool.sectorsite

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["ru.cool.sectorsite.repository"])
class SectorSiteApplication

fun main(args: Array<String>) {
    println("🔍 SPRING_DATASOURCE_URL = ${System.getenv("SPRING_DATASOURCE_URL")}")
    runApplication<SectorSiteApplication>(*args)
}
