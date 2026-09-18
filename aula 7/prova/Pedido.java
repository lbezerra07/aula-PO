import java.util.ArrayList;

public class Pedido {

    private String cliente;
    private ArrayList<Produto> produtos;

 
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

   
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

   
    public double calcularTotal() {
        double total = 0;

        
        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }

    
    public void listarProdutos() {
        System.out.println("Produtos:");
        for (Produto p : produtos) {
            p.exibirDados();
        }
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }

    public String getCliente() {
        return cliente;
    }
}

