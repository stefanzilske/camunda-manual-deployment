import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.springframework.boot") version "2.6.1"
}

group = "de.holisticon"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.6.1"))
    implementation(platform("org.camunda.bpm:camunda-bom:7.16.0"))

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp:7.16.0")
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-rest:7.16.0")
    implementation("io.github.microutils:kotlin-logging:2.1.20")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    runtimeOnly("com.h2database:h2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}
