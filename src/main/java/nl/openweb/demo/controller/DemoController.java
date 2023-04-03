package nl.openweb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @GetMapping
    public Mono<String> getDemo() {
        return Mono.fromSupplier(() -> String.format("The time is: %s", LocalDateTime.now()));
    }
}
