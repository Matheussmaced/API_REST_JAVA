package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControlle {
  @GetMapping
  public String welcome() {
    return "Welcome to my Spring Boot Web API";
  }
}
