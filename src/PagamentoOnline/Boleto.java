package PagamentoOnline;

import java.util.Random;

public class Boleto implements MetodoPagamento {

    @Override
    public boolean pagar(double valor){
        System.out.println("[Boleto] Gerando documento...");
        String codigoBarras = gerarCodigoBarras();
        System.out.println("[Boleto] Gerado com sucesso. Código de barras: " + codigoBarras);
        System.out.println("[Boleto] Status: PENDENTE DE PAGAMENTO pelo cliente.");
        return true;
    }

    private String gerarCodigoBarras() {
        Random random = new Random();
        long numero = Math.abs(random.nextLong());
        return "34191." + String.valueOf(numero).substring(0, 5) + " " +
                String.valueOf(numero).substring(5, 10) + " " +
                String.valueOf(numero).substring(10, 15);
    }

    @Override
    public String getNome() {
        return "Boleto Bancário";
    }
}
