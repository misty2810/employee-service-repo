package com.testing_demo.springboot_testing.Controllers;

import com.testing_demo.springboot_testing.TestContainerConfiguration;
import com.testing_demo.springboot_testing.dto.EmployeeDto;
import com.testing_demo.springboot_testing.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.boot.webtestclient.autoconfigure.AutoConfigureWebTestClient;

@AutoConfigureWebTestClient(timeout = "100000")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestContainerConfiguration.class)
public class AbstractIntegrationTest {
    @Autowired
    WebTestClient webTestClient;

    Employee testEmployee = Employee.builder()
//            .id(1L)
            .email("anuj@gmail.com")
            .name("Anuj")
            .salary(200L)
            .build();
    EmployeeDto testEmployeeDto = EmployeeDto.builder()
//            .id(1L)
            .email("anuj@gmail.com")
            .name("Anuj")
            .salary(200L)
            .build();
}
