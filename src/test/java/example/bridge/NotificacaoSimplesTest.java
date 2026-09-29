package example.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificacaoSimplesTest {

    @Test
    void deveEnviarNotificacaoSimplesPorEmail() {
        Notificacao notificacao = new NotificacaoSimples(new CanalEmail());
        assertEquals("E-mail enviado: Reuniao as 10h", notificacao.enviar("Reuniao as 10h"));
    }

    @Test
    void deveEnviarNotificacaoSimplesPorSMS() {
        Notificacao notificacao = new NotificacaoSimples(new CanalSMS());
        assertEquals("SMS enviado: Reuniao as 10h", notificacao.enviar("Reuniao as 10h"));
    }
}
