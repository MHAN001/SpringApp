package hanxu.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class ConstructorGreetingService implements GreetingService{
    public String sayGreeting() {
        return "Hi this is injected by constructor";
    }
}
