package org.example.spring6di.services.i18n;

import org.example.spring6di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("FA")
@Service("i18NService")
public class FarsiGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "سلام دنیا!";
    }
}
