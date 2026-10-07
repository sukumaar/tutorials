package sukumaar.example.helloworld;

import org.springframework.stereotype.Service;

// Services hold the application's work so controllers can focus on HTTP requests.
@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello, World!";
    }
}
