package example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalSMSTest {

    @Test
    void deveEnviarPorSMS() {
        ICanalEnvio canal = new CanalSMS();
        assertEquals("SMS enviado: Ola mundo", canal.enviar("Ola mundo"));
    }
}
