package org.example.spring6di.services;

import org.springframework.stereotype.Service;

@Service("defaultGreetingBean")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone from base service!";
    }
}
