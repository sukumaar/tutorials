package sukumaar.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// A REST controller turns Java method results into HTTP responses.
@RestController
public class GreetingController {

    private final GreetingService greetingService;

    // Spring provides the service here (constructor dependency injection).
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Visiting GET /greeting returns the text from the service.
    @GetMapping("/greeting")
    public String greeting() {
        return greetingService.getGreeting();
    }
}
