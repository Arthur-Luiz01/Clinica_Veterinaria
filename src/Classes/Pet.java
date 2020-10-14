package Classes;
import java.*;
public class Pet {

	// Atributos

	private String categoria;
	private String nome;
	private String raca;
	private char genero;

	// Construtor

	public Pet (String categoria, String nome, String raca, char genero) {

		this.categoria = categoria;
		this.nome = nome;
		this.raca = raca;
		this.genero = genero;

	}

	// Get e Set

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}

	// Metodo toString

	@Override
	public String toString() {

		return "Pet [categoria=" + categoria + ", nome=" + nome + ", raca=" + raca + ", genero=" + genero + "]";
	}

}
