package hanxu.demo.controllers;

import hanxu.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    @Autowired
    private GreetingService constructorGreetingService;

    public ConstructorController(GreetingService greetingService) {
        this.constructorGreetingService = greetingService;
    }

    public String sayHello(){
        return this.constructorGreetingService.sayGreeting();
    }
}
