public class Main {
    
    public static void main (String[] args) {
        Pedido pedido = new Pedido();

        observador email = new NotificadorEmail();
        Obeservador sms = new NotificadorSMS();

        pedido.adicionarObservador(email);
        pedido.adicionarObservador(sms);

        pedido.confirmarPedido();
    }
}