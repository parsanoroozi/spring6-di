package org.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
class ConstructorInjectControllerTest {

    @Autowired
    ConstructorInjectController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}