package LeitorArquivos;

public class LeitorCSV implements LeitorArquivo {
    @Override
    public void lerArquivo(String caminhoArquivo) {
        System.out.println("Lendo arquivo CSV: " + caminhoArquivo);
        System.out.println("Conteúdo: [Nome,Idade,Cidade] -> [João,30,SP] -> [Maria,25,RJ]");
    }

    @Override
    public String getFormato() {
        return "CSV";
    }
}