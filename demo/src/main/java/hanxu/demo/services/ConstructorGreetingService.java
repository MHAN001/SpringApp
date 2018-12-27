package hanxu.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    public String sayGreeting() {
        return "Hi this is injected by constructor";
    }
}
