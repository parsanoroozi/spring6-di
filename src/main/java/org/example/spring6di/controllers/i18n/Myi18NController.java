package org.example.spring6di.controllers.i18n;

import org.example.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@RequiredArgsConstructor
@Controller
public class Myi18NController {

    @Qualifier("i18NService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
