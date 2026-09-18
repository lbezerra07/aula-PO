public class PagamentoBoleto implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via boleto realizado: R$ %.2f%n", valor);
    }
}
