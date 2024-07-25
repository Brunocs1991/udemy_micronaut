package brunocs.com.udemy.service;

import brunocs.com.udemy.shared.MyService;
import jakarta.inject.Singleton;

@Singleton
public class HelloWordService  implements MyService {

    @Override
    public String helloFromService() {
        return "Hello from service!";
    }

}
