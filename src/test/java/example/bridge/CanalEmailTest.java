package example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalEmailTest {

    @Test
    void deveEnviarPorEmail() {
        ICanalEnvio canal = new CanalEmail();
        assertEquals("E-mail enviado: Ola mundo", canal.enviar("Ola mundo"));
    }
}
