package brunocs.com.udemy.hello;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class HelloWordControllerTest {

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void helloWorldEndpointresponseWithTextHelloWorld() {
        var response = httpClient.toBlocking().retrieve("/hello");
        assertEquals("Hello World", response);
    }

        @Test
    void helloWorldEndpointresponseWithStatusCode200() {
        var response = httpClient.toBlocking().exchange("/hello", String.class);
       assertEquals(HttpStatus.OK, response.getStatus());
       assertEquals(Optional.of("Hello World"), response.getBody());
    }


}
