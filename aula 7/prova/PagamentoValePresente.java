
public class PagamentoValePresente implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento com vale-presente realizado: R$ %.2f%n", valor);
    }
}
