package brunocs.com.udemy.hello;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWordController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String helloWrold() {
        return "Hello World";
    }
}
