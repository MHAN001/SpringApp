package hanxu.demo.controllers;

import hanxu.demo.services.GreetingService;

public class SetterController {
    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
