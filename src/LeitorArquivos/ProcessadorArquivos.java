package LeitorArquivos;

public class ProcessadorArquivos {
    public void processar(LeitorArquivo leitor, String caminho) {
        System.out.println("\n--- Processador de Arquivos ---");
        System.out.println("Detectado formato: " + leitor.getFormato());
        System.out.println("Iniciando leitura...");
        leitor.lerArquivo(caminho);
        System.out.println("--- Leitura finalizada ---");
    }
}