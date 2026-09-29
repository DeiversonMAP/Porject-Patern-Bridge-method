package example.bridge;

public class CanalEmail implements ICanalEnvio {
    @Override
    public String enviar(String mensagem) {
        return "E-mail enviado: " + mensagem;
    }
}
