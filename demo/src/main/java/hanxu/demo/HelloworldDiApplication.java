package hanxu.demo;

import hanxu.demo.controllers.ConstructorController;
import hanxu.demo.controllers.MyController;
import hanxu.demo.controllers.PropertyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldDiApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(HelloworldDiApplication.class, args);
        MyController controller = (MyController) context.getBean("myController");
        controller.hello();
        System.out.println(context.getBean(PropertyController.class).sayHello());
    }

}

