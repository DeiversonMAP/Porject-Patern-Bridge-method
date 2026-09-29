package example.bridge;

public class CanalPush implements ICanalEnvio {
    @Override
    public String enviar(String mensagem) {
        return "Push enviado: " + mensagem;
    }
}
