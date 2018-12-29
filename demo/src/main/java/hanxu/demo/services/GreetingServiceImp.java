package hanxu.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class GreetingServiceImp implements GreetingService{
    public static final String Hello_XU = "Hello XU!";


    public String sayGreeting() {
        return Hello_XU;
    }
}
