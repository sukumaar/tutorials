# Hello World Spring Boot

[Back to all tutorials](../readme.md)

A small Java web application to help you get started with Spring Boot. It shows how a controller and service work together, how Spring passes dependencies between them, and how to test each class.

## Requirements

- JDK 25 (the version targeted by `pom.xml`)
- Maven 3.6.3 or newer

## Run the application

From this directory, run:

```sh
mvn spring-boot:run
```

The app uses a random available port (`server.port=0`), which can change each time you start it. At the bottom of the startup output, it prints a clickable URL with the actual port filled in:

```text
Open the greeting: http://localhost:<assigned-port>/greeting
```

Here, `<assigned-port>` stands for the port chosen at startup. Click the complete URL printed in your terminal, or copy it into your browser. You should see:

```text
Hello, World!
```

## Run the tests

```sh
mvn clean compile test
```

`GreetingServiceTest` checks the greeting with JUnit. In `GreetingControllerTest`, Mockito supplies a mock service whose response the test controls. The test checks what the controller returns and verifies that it called the service.

## What each class does

- `HelloWorldApplication` starts the Spring Boot application.
- `GreetingController` handles the `GET /greeting` web request.
- `GreetingService` returns the greeting text.

Spring creates the controller and passes a `GreetingService` to its constructor. That's dependency injection: the controller receives the service it needs.
