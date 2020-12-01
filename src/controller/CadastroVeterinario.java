package controller;
import model.Cliente;
import model.Veterinario;
public class CadastroVeterinario {

	GerenciaCadastro gc = new GerenciaCadastro();

	public static CadastroVeterinario instance = new CadastroVeterinario();
	public static synchronized CadastroVeterinario getInstance() {
		if(instance != null) {
			return instance;
		} else {
			instance = new CadastroVeterinario();
			return instance;
		}
	}
	private CadastroVeterinario () {
		
	}		
	
    public void cadastrarVet(Veterinario vet) {
		gc.cadastrarVet(vet);
    }
    public void exibirTodos() {
		gc.exibirTodosVet();
	}
	public void remover (String cpf) {
		gc.removerVet(cpf);
	}
	public void consultarVeterinario (String cpf, Cliente cliente) {
		gc.consultarVeterinario(cpf, cliente);
	}
	public void exibirClientes (String cpf) {
		gc.exibirClientes(cpf);
	}
	@Override
	public String toString () {
		return gc.toStringVet();
	}
}
