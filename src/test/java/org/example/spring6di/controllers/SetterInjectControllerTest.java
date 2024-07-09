package org.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
class SetterInjectControllerTest {

    @Autowired
    SetterInjectController controller;

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}