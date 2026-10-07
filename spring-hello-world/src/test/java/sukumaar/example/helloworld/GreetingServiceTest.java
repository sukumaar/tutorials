package sukumaar.example.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

    @Test
    void returnsHelloWorld() {
        // This simple class has no Spring dependencies, so we can create it directly.
        GreetingService service = new GreetingService();

        assertEquals("Hello, World!", service.getGreeting());
    }
}
