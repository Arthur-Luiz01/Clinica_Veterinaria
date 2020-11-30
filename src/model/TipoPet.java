package model;

public class TipoPet {
    
    private String tipo;

    public TipoPet (String tipo){
	this.tipo = tipo;
    }
    
    public String getTipopet() {
		return tipo;
	}
	public void setTipopet(String tipo) {
		this.tipo = tipo;
	}
        
    @Override
    public String toString() {
	return " " + tipo + " ";
	}
}
