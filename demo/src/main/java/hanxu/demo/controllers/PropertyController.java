package hanxu.demo.controllers;
import hanxu.demo.services.GreetingService;
import hanxu.demo.services.GreetingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class PropertyController {
//    @Autowired
//    @Qualifier("constructorGreetingService")
    private GreetingService constructorGreetingService;

    public String sayHello(){
        return constructorGreetingService.sayGreeting();
    }
}
