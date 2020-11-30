package controller;
import java.util.*;

import model.Cliente;
import model.Veterinario;
public class CadastroVeterinario {
    GerenciaCadastro gc = new GerenciaCadastro();
    ArrayList<Veterinario> veterinarios = new ArrayList();
    
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
