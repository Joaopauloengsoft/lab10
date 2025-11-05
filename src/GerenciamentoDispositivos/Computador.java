package GerenciamentoDispositivos;

public class Computador {
    public void conectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("\n>>> Computador: Conectando novo dispositivo...");
        dispositivo.conectar();
        System.out.println(">>> Computador: " + dispositivo.getTipo() + " reconhecido e pronto para uso.");
    }

    public void desconectarDispositivo(DispositivoConectavel dispositivo) {
        System.out.println("\n>>> Computador: Desconectando dispositivo...");
        dispositivo.desconectar();
        System.out.println(">>> Computador: " + dispositivo.getTipo() + " removido com segurança.");
    }
}