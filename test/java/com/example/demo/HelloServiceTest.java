package com.example.demo;

import com.example.demo.services.HelloService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    HelloService helloService;

    @DisplayName("Test")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", helloService.get());
    }
}
