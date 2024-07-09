package org.example.spring6di.controllers;

import org.example.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {

    private final GreetingService greetingService;

    public ConstructorInjectController(@Qualifier("defaultGreetingBean") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
