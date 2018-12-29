package hanxu.demo.controllers;

import hanxu.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
@Controller
public class OriginalController extends MyController{
    @Autowired
    @Qualifier("greetingServiceImp")
    private GreetingService greetingServiceImp;

    @Override
    public String hello(){
        return this.greetingServiceImp.sayGreeting();
    }
}
