package org.example.spring6di.controllers;

import org.example.spring6di.services.GreetingService;
import org.example.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in controller");

        return greetingService.sayGreeting();
    }
}
