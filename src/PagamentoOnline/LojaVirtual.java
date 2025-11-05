package PagamentoOnline;

public class LojaVirtual {
    public void processarCompra(double valor, MetodoPagamento metodo) {
        System.out.println("\n--- Iniciando Compra na Loja Virtual ---");
        System.out.println("Valor da compra: R$ " + String.format("%.2f", valor));
        System.out.println("Método escolhido: " + metodo.getNome());

        boolean sucesso = metodo.pagar(valor);

        if (sucesso) {
            System.out.println(">>> Resultado: Compra processada com sucesso!");
        } else {
            System.out.println(">>> Resultado: Falha ao processar a compra.");
        }
        System.out.println("----------------------------------------");
    }
}
