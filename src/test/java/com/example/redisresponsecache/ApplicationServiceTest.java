package com.example.redisresponsecache;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationServiceTest {

    @Autowired
    ApplicationService applicationService;

    @Test
    void test() {
        Application application = applicationService.create("안녕~");
        Application findApplication = applicationService.find(application.getId());
    }

}