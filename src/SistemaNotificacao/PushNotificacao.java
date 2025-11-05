package SistemaNotificacao;

public class PushNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[Push] Enviando alerta para o aplicativo móvel: " + mensagem);
    }
}