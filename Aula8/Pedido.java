import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private List<Observador> observadores; 
    private String status;

    public Pedido() {
        this.observadores = new ArrayList<>();
        this.observadores = "PENDENTE";
    }

    public voidd adicionarObservador(Observador observador) {
        this.observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        this.observadores.remove(observador);
    }

    private void notificadorObservadores() {
        for(Observador observador : observadores){
            observador.atualizar("Pedido atualizado: " + status);
        }
    }

    private void confirmarPedido(){
        this.status = "Confirmado";
        this.notificadorObservadores();
    }

}