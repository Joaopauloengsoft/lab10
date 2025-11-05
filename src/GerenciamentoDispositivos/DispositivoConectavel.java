package GerenciamentoDispositivos;

public interface DispositivoConectavel {
    void conectar();
    void desconectar();
    String getTipo();
}