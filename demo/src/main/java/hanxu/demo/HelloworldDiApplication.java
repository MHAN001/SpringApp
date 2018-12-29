package hanxu.demo;

import hanxu.demo.controllers.ConstructorController;
import hanxu.demo.controllers.MyController;
import hanxu.demo.controllers.OriginalController;
import hanxu.demo.controllers.PropertyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloworldDiApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(HelloworldDiApplication.class, args);
        MyController controller = (OriginalController) context.getBean("originalController");
//        controller.say  ();
        System.out.println(context.getBean(OriginalController.class).hello());
    }

}

