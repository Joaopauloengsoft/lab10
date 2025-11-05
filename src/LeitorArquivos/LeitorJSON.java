package LeitorArquivos;

public class LeitorJSON implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo JSON: " + caminhoArquivo);
        System.out.println("Conteúdo: { \"usuario\": \"admin\", \"ativo\": true }");
    }

    @Override
    public String getFormato() {
        return "JSON";
    }
}