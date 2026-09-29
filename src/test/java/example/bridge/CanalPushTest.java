package example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanalPushTest {

    @Test
    void deveEnviarPorPush() {
        ICanalEnvio canal = new CanalPush();
        assertEquals("Push enviado: Ola mundo", canal.enviar("Ola mundo"));
    }
}
