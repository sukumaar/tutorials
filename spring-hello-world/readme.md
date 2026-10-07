# Hello World Spring Boot

[Back to all tutorials](../readme.md)

A small Java web application for learning the basics of Spring Boot, controllers, services, dependency injection, and unit tests.

## Requirements

- JDK 25 (the version targeted by `pom.xml`)
- Maven 3.6.3 or newer

## Run the application

From this directory, run:

```sh
mvn spring-boot:run
```

Then open <http://localhost:8080/greeting>. The response is:

```text
Hello, World!
```

## Run the tests

```sh
mvn clean compile test
```

`GreetingServiceTest` uses JUnit to check the greeting. `GreetingControllerTest` uses Mockito to replace the service with a controllable mock, then checks the controller's response and verifies that it called the service.

## What each class does

- `HelloWorldApplication` starts the Spring Boot application.
- `GreetingController` handles the `GET /greeting` web request.
- `GreetingService` supplies the greeting text.

Spring creates the controller and provides its `GreetingService` dependency through the constructor. This is called dependency injection.
