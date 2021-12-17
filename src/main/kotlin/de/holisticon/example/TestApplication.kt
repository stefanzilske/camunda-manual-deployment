package de.holisticon.example

import de.holisticon.example.deployment.CamundaDeploymentProperties
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableProcessApplication
@EnableConfigurationProperties(CamundaDeploymentProperties::class)
open class TestApplication

fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)
}