package example.bridge;

public class CanalSMS implements ICanalEnvio {
    @Override
    public String enviar(String mensagem) {
        return "SMS enviado: " + mensagem;
    }
}
