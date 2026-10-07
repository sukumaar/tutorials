package sukumaar.example.helloworld;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

// MockitoExtension starts Mockito for this test without starting a web server.
@ExtendWith(MockitoExtension.class)
class GreetingControllerTest {

    @Mock
    private GreetingService greetingService;

    @InjectMocks
    private GreetingController greetingController;

    @Test
    void returnsGreetingFromService() {
        // A mock lets this test control the service's answer.
        when(greetingService.getGreeting()).thenReturn("Hello, fresher!");

        String greeting = greetingController.greeting();

        assertEquals("Hello, fresher!", greeting);
        verify(greetingService).getGreeting();
    }
}
