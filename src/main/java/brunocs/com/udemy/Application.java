package brunocs.com.udemy;

import brunocs.com.udemy.service.HelloMicronautService;
import brunocs.com.udemy.service.HelloWordService;
import io.micronaut.runtime.Micronaut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        var context = Micronaut.run(Application.class, args);
        LOG.info("Message from service: {}", context.getBean(HelloWordService.class).helloFromService());
        LOG.info("Message from service: {}", context.getBean(HelloMicronautService.class).helloFromService());
    }
}