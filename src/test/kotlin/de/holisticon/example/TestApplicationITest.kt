package de.holisticon.example

import org.assertj.core.api.Assertions.assertThat
import org.camunda.bpm.engine.ProcessEngine
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class TestApplicationITest(
    @Autowired val processEngine: ProcessEngine
) {

    @Test
    internal fun `deploy two deployments for different tenants`() {
        val deployments = processEngine.repositoryService.createDeploymentQuery().list()

        assertThat(deployments).hasSize(2)
        assertThat(deployments.map { it.tenantId }).containsExactlyInAnyOrder(null, "1")
    }
}