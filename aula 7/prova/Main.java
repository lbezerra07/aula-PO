import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Maria");

        pedido.adicionarProduto(new Produto("Notebook", 3500.00));
        pedido.adicionarProduto(new Produto("Mouse", 80.00));
        pedido.adicionarProduto(new Produto("Teclado", 150.00));

        pedido.listarProdutos();

        System.out.println(); 

        PagamentoService pagamentoService = new PagamentoService();
        double total = pedido.calcularTotal();

        pagamentoService.processar(new PagamentoPix(), total);

        System.out.println();

        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new PagamentoPix());
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoBoleto());
        pagamentos.add(new PagamentoValePresente()); 

        System.out.println("Processando o mesmo valor em todas as formas de pagamento:");

        for (Pagamento pagamento : pagamentos) {
            pagamentoService.processar(pagamento, total);
        }
    }
}
