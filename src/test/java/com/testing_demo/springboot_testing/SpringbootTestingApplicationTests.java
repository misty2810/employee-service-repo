package com.testing_demo.springboot_testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainerConfiguration.class)
class SpringbootTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}
