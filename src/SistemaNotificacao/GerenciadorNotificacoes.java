package SistemaNotificacao;

public class GerenciadorNotificacoes {
    public void enviar(Notificavel canal, String mensagem) {
        System.out.println("--- Iniciando envio de notificação ---");
        canal.enviarNotificacao(mensagem);
        System.out.println("--- Envio concluído ---\n");
    }
}