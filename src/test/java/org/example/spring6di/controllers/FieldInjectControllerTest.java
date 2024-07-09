package org.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
class FieldInjectControllerTest {

    @Autowired
    FieldInjectController fieldInjectController;

    @Test
    void sayHello() {
        System.out.println(fieldInjectController.sayHello());
    }

}