package SistemaNotificacao;

public class EmailNotificacao implements Notificavel {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("[Email] Enviando para destinatario@email.com: " + mensagem);
    }
}