package com.testing_demo.springboot_testing.services.impl;

import com.testing_demo.springboot_testing.services.DataService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DataServiceImplDev implements DataService {
    @Override
    public String getData() {
        return "Dev data";
    }
}
