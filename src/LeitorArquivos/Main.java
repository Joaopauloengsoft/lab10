package LeitorArquivos;

public class Main {
    public static void main(String[] args) {
        ProcessadorArquivos processador = new ProcessadorArquivos();

        LeitorArquivo leitorTxt = new LeitorTXT();
        LeitorArquivo leitorCsv = new LeitorCSV();
        LeitorArquivo leitorJson = new LeitorJSON();

        processador.processar(leitorTxt, "documento.txt");
        processador.processar(leitorCsv, "dados_usuarios.csv");
        processador.processar(leitorJson, "configuracoes.json");
    }
}
