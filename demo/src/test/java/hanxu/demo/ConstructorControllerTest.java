package hanxu.demo;

import hanxu.demo.controllers.ConstructorController;
import hanxu.demo.services.GreetingService;
import hanxu.demo.services.GreetingServiceImp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorControllerTest {
    private ConstructorController constructorController;

    @Before
    public void setup() throws Exception{
        this.constructorController = new ConstructorController(new GreetingServiceImp());
    }

    @Test
    public void testGreeting() throws Exception{
         assertEquals(GreetingServiceImp.Hello_XU, constructorController.sayHello());
    }
}
