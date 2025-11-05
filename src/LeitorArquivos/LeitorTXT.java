package LeitorArquivos;

public class LeitorTXT implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo de texto: " + caminhoArquivo);
        System.out.println("Conteúdo: [Linha 1 do texto... Linha 2 do texto...]");
    }

    @Override
    public String getFormato() {
        return "TXT";
    }
}