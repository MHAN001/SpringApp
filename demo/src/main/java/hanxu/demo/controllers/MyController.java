package hanxu.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("This is hello method");
        return "this is foo";
    }
}
