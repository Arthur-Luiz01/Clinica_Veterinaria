package memento;
import java.util.ArrayList;
public class CareTaker {
    
    private ArrayList<Memento> mementoLista = new ArrayList<Memento>();
    
    public void add(Memento estado){
        mementoLista.add(estado);
    }
    public Memento get(int posicao){
        return mementoLista.get(posicao);
    }
}
