package SistemaNotificacao;

public class SMSNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[SMS] Enviando para (11) 99999-9999: " + mensagem);
    }
}
