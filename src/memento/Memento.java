package memento;
import model.Cliente;
public class Memento {
    private Cliente estado;
    
    public Memento(Cliente estado){
        this.estado = estado;
    }
    public Cliente getEstado(){
        return estado;
    }
}
