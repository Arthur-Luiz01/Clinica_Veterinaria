package memento;
import model.Cliente;

public class Originator {
    private Cliente estado;
    
public void setEstado(Cliente estadoASalvar) {
    this.estado = estadoASalvar;
}
public Cliente getEstado () {
    return this.estado;
}
public Memento salvarEstadoMemento(){
    return new Memento(estado);
}
public void getEstadoSalvoMemento(Memento ultimoEstado){
    estado = ultimoEstado.getEstado();
}
}
