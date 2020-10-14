package Classes;
public class Cliente implements Comparable<Cliente> {

	// Atributos

	private String nome;
	private String cpf;
	private Pet[] pet;

	// Construtor 2

	public Cliente(String cpf, String nome, Pet[] pet){
		this.cpf = cpf;
		this.nome = nome;
		this.pet = pet;
	}

	// Get e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) { // VALIDACAO DO CPF
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) { // VALIDACAO DO CPF
		if (cpf.length() == 11 ){
		this.cpf = cpf;
		} else {
			System.out.println("Tamanho de CPF invalido");
		}
	}

	// Metodo toString

	@Override
	public String toString() {
		String aux ="";
		for (int i = 0; i < pet.length; i++) {
			aux+= pet[i].toString() + "\n";
		}
		return "Nome: " + this.nome + 
		"\n CPF: " + this.cpf + 
		"\n Pet: " + aux;
	}

	// Metodo compareTo

	@Override
	public int compareTo(Cliente a) {
		return this.cpf.compareTo(a.getCpf());
		
	}

}
