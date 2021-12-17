# Showcase for manual deployment with Camunda SpringBoot

Camunda auto deployment is deactivated (no `processes.xml` in resources), deployment of process definitions is done manually using SpringBoot EventListener and Camunda's RepositoryService.

Build the project with `./gradlew clean build` and run with `./gradlew bootRun`. Try also to run the generated JAR file in `/build/libs` with `java -jar` and check the logs for deployed process archives. It works!