package PagamentoOnline;

public class PayPal implements MetodoPagamento{
    private String cpfUsuario;

    public PayPal(String cpfUsuario){
        this.cpfUsuario = cpfUsuario;
    }

    @Override
    public boolean pagar(double valor) {
        System.out.println("[PAYPAL] CONECTANDO AO SERVIDOR...");
        System.out.println("[PAYPAL] PAGANDO POR: "+cpfUsuario);
        System.out.println("[PAYPAL] CONFERINDO VALOR: R$"+valor);
        System.out.println("[PAYPAL] TRANFERENCIA FEITA COM SUCESSO!");
        return true;
    }

    @Override
    public String getNome() {
        return "PayPal";
    }
}
