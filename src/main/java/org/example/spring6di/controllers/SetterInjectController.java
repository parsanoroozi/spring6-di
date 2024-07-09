package org.example.spring6di.controllers;

import org.example.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectController {


    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("defaultGreetingBean") GreetingService greetingService) {
        System.out.println("the setter is getting called");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
