package sukumaar.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Starts Spring Boot and scans this package for application components.
@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(HelloWorldApplication.class, args);
        var port = context.getEnvironment().getRequiredProperty("local.server.port");
        System.out.println("\nOpen the greeting: http://localhost:" + port + "/greeting\n");
    }
}
