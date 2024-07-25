package brunocs.com.udemy.service;

import brunocs.com.udemy.shared.MyService;
import io.micronaut.context.annotation.Primary;
import jakarta.inject.Singleton;


@Primary
@Singleton
public class HelloMicronautService implements MyService {

    @Override
    public String helloFromService() {
        return "Hello Micronaut!";
    }

}
