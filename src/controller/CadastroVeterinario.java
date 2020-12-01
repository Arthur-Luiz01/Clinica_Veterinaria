package controller;
import model.Cliente;
import model.Veterinario;
public class CadastroVeterinario {

	GerenciaVeterinario gv = new GerenciaVeterinario();

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
		gv.cadastrarVet(vet);
    }
    public void exibirTodos() {
		gv.exibirTodosVet();
	}
	public void remover (String cpf) {
		gv.removerVet(cpf);
	}
	public void consultarVeterinario (String cpf, Cliente cliente) {
		gv.consultarVeterinario(cpf, cliente);
	}
	public void exibirClientes (String cpf) {
		gv.exibirClientes(cpf);
	}
	@Override
	public String toString () {
		return gv.toStringVet();
	}
}
