package brunocs.com.udemy;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class MnGettingStartedTest {

    @Inject
    EmbeddedApplication<?> application;

    @Test
    void testApplicationStartup() {
        // Verifica se a aplicação é iniciada sem lançar exceções
        Assertions.assertDoesNotThrow(() -> Application.main(new String[]{}));
    }

    @Test
    void testContextIsRunning() {
        // Verifica se o contexto da aplicação está rodando
        Assertions.assertTrue(application.isRunning(), "The application context should be running");
    }

}
