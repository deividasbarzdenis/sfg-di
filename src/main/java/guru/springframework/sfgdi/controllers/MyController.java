package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(@Qualifier("PetService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
