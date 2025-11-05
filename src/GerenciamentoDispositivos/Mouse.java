package GerenciamentoDispositivos;

public class Mouse implements DispositivoConectavel {
    @Override
    public void conectar() {
        System.out.println("[Mouse] Conectado. Sensor óptico ativo.");
    }

    @Override
    public void desconectar() {
        System.out.println("[Mouse] Desconectado.");
    }

    @Override
    public String getTipo() {
        return "Mouse";
    }
}