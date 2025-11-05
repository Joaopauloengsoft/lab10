package PagamentoOnline;

public class CartaoCredito implements MetodoPagamento {
    private double limiteDisponivel;

    public CartaoCredito(double limiteInicial) {
        this.limiteDisponivel = limiteInicial;
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("[Cartão de Crédito] Iniciando transação...");
        if (valor <= limiteDisponivel) {
            limiteDisponivel -= valor;
            System.out.println("[Cartão de Crédito] Limite verificado. Autorizado.");
            return true;
        } else {
            System.out.println("[Cartão de Crédito] Negado: Limite insuficiente.");
            return false;
        }
    }

    @Override
    public String getNome() {
        return "Cartão de Crédito";
    }
}