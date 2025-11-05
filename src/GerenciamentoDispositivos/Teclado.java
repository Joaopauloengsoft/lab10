package GerenciamentoDispositivos;

public class Teclado implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("[Teclado] Conectado via USB. Pronto para digitação.");
    }

    @Override
    public void desconectar() {
        System.out.println("[Teclado] Desconectado.");
    }

    @Override
    public String getTipo() {
        return "Teclado";
    }
}
