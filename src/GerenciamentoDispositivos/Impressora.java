package GerenciamentoDispositivos;

public class Impressora implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("[Impressora] Conectada. Verificando níveis de tinta...");
    }

    @Override
    public void desconectar() {
        System.out.println("[Impressora] Desconectada.");
    }

    @Override
    public String getTipo() {
        return "Impressora";
    }
}