package GerenciamentoDispositivos;

public class Main {
    public static void main(String[] args) {
        Computador meuPC = new Computador();

        DispositivoConectavel teclado = new Teclado();
        DispositivoConectavel mouse = new Mouse();
        DispositivoConectavel impressora = new Impressora();

        meuPC.conectarDispositivo(teclado);
        meuPC.conectarDispositivo(mouse);
        meuPC.conectarDispositivo(impressora);

        meuPC.desconectarDispositivo(impressora);
        meuPC.desconectarDispositivo(teclado);
        meuPC.desconectarDispositivo(mouse);
    }
}