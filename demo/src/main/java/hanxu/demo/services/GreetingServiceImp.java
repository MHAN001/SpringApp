package hanxu.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService{
    public static final String Hello_XU = "Hello XU!";


    public String sayGreeting() {
        return Hello_XU;
    }
}
