package com.example.hello;
import java.net.InetAddress;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
  @GetMapping("/")
  public Map<String, String> hello() throws Exception {
    //String env = System.getenv().getOrDefault("ENV_VALUE", "No env set");
    String env = System.getenv().getOrDefault("DB_PASSWORD", "No env set");//DB_PASSWORD value is set in app_service.yaml and secret.yaml, under the directory k8s-spring
    String hostname = InetAddress.getLocalHost().getHostName();
    
    return Map.of("message", "Hello from Simple App (Spring Boot) - designed by ROMEO", "env", env, "container", hostname);
  }
}
