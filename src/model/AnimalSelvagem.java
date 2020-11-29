package model;
public class AnimalSelvagem {

    private String codigo;
	private String especie;
	
	public AnimalSelvagem (String codigo, String especie) {
        this.codigo = codigo;
		this.especie = especie;
	}

    public String getCodigo() {
        return codigo;
	}
    public void setCodigo(String codigo) {
        this.codigo = codigo;
	}
	public String getNome() {
		return especie;
	}
	public void setNome(String especie) {
		this.especie = especie;
	}
	@Override
	public String toString() {
        return "AnimalSelvagem [codigo=" + codigo + ", especie=" + especie +  "]";
	}
}
