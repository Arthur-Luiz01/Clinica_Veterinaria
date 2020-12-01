package controller;
import model.Cliente; 
public class CadastroCliente {
	
	GerenciaCadastro gc = new GerenciaCadastro();
	
	public static CadastroCliente instance = new CadastroCliente();
	public static synchronized CadastroCliente getInstance() {
		if(instance != null) {
			return instance;
		} else {
			instance = new CadastroCliente();
			return instance;
		}
	}
	private CadastroCliente () {

	}		
	public void cadastrarCliente(Cliente cliente) {
		gc.cadastrarCliente(cliente);
	}
	public void exibirTodos() {
		gc.exibirTodosCliente();
	}
	public void remover (String cpf) {
		gc.removerCliente(cpf);
	}
	public void alterarNome (String cpf) {
		gc.alterarNome(cpf);
	}
	public void alterarPet (String cpf) {
		gc.alterarPet(cpf);
	}
	public Cliente consultarCliente(String cpf){
		return gc.consultarCliente(cpf);	
	}
	@Override
	public String toString () {
		return gc.toStringCliente();
	}
}
