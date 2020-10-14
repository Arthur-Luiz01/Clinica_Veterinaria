package Cadastro;

import java.util.*;
import Classes.Cliente; 
import java.util.ArrayList;

public class CadastroCliente {
	Scanner in = new Scanner(System.in);
	ArrayList<Cliente> agenda = new ArrayList();
		
	public void cadastrarCliente(Cliente cliente) {
		agenda.add(cliente);
	}
	public void exibirTodos() {
		int n = agenda.size();
		for (int i=0; i<n; i++) {
		  System.out.println(agenda.get(i));
		}
	}
	public void remover (String cpf) {
		
		for (Cliente c: agenda){
			if(c.getCpf().equals(cpf) == true) {
				agenda.remove(agenda.indexOf(c));
			}
		}
	}
	public void alterarNome (String cpf) {
		for (Cliente c: agenda) {
			if(c.getCpf().equals(cpf) == true){
				System.out.println("Informe novo Nome");
				String aux = in.next();
				c.setNome(aux);
			}
		}
	}
	public void alterarPet (String cpf) {
		for(Cliente c: agenda) {
			if(c.getCpf().equals(cpf) == true){
				
			}
		}
	}

	@Override
	public String toString () {
		String aux = "";
		for(Cliente c: agenda){
			aux+= c.toString() + "\n";
		}
		return aux;
	}
}
