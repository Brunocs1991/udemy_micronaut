package brunocs.com.udemy.service;

import jakarta.inject.Singleton;

@Singleton
public class HelloWordService {

    public String helloFromService() {
        return "Hello from service!";
    }

}
