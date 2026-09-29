package example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoUrgenteTest {

    @Test
    void deveEnviarNotificacaoUrgentePorPush() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalPush());
        assertEquals("Push enviado: [URGENTE] Servidor caiu", notificacao.enviar("Servidor caiu"));
    }

    @Test
    void deveEnviarNotificacaoUrgentePorEmail() {
        Notificacao notificacao = new NotificacaoUrgente(new CanalEmail());
        assertEquals("E-mail enviado: [URGENTE] Servidor caiu", notificacao.enviar("Servidor caiu"));
    }
}
