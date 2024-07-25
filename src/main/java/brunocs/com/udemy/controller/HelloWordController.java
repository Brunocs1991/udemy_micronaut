package brunocs.com.udemy.controller;

import brunocs.com.udemy.service.HelloWordService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;

@Singleton
@Controller("/hello")
public class HelloWordController {

    private final HelloWordService service;

    public HelloWordController(final HelloWordService service) {
        this.service = service;
    }

    @Get(produces = MediaType.TEXT_PLAIN)
    public String helloWrold() {
        return service.helloFromService();
    }
}
