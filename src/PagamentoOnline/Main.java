package PagamentoOnline;

public class Main {
    public static void main(String[] args) {
        LojaVirtual minhaLoja = new LojaVirtual();

        MetodoPagamento cartao = new CartaoCredito(1000.00);
        minhaLoja.processarCompra(450.50, cartao);

        MetodoPagamento paypal = new PayPal("cliente@email.com");
        minhaLoja.processarCompra(75.90, paypal);

        MetodoPagamento boleto = new Boleto();
        minhaLoja.processarCompra(1200.00, boleto);

        minhaLoja.processarCompra(600.00, cartao);
    }
}