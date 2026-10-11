package com.testing_demo.springboot_testing;

import com.testing_demo.springboot_testing.services.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringbootTestingApplication implements CommandLineRunner {
    private final DataService dataService;

    @Value("${my.variable}")
    private String myVariable;

    public static void main(String[] args) {

        SpringApplication.run(SpringbootTestingApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("my variable is: "+myVariable);
        System.out.println("the data is: "+dataService.getData());
    }
}
