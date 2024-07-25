package brunocs.com.udemy.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
class HelloWordControllerTest {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWordControllerTest.class);

    @Inject
    @Client("/")
    HttpClient httpClient;

    @Test
    void helloWorldEndpointresponseWithTextHelloWorld() {
        var response = httpClient.toBlocking().retrieve("/hello");
        LOG.trace("Response: {}", response);
        assertEquals("Hello Micronaut!", response);
    }

        @Test
    void helloWorldEndpointresponseWithStatusCode200() {
        var response = httpClient.toBlocking().exchange("/hello", String.class);
       assertEquals(HttpStatus.OK, response.getStatus());
       assertEquals(Optional.of("Hello Micronaut!"), response.getBody());
    }


}
