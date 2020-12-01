package controller;
import java.util.*;
import model.Cliente;
import model.Veterinario;
public class GerenciaCliente {
    Scanner in = new Scanner(System.in);
    private ArrayList<Cliente> agenda = new ArrayList();
    ArrayList<Veterinario> veterinarios = new ArrayList();

    public void cadastrarCliente(Cliente cliente) {
		agenda.add(cliente);
    }
    public void exibirTodosCliente() {
		int n = agenda.size();
		for (int i=0; i<n; i++) {
		  System.out.println(agenda.get(i));
		}
    }
    public void removerCliente (String cpf) {
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
    public Cliente consultarCliente(String cpf){
		for(Cliente c: agenda) {
			if(c.getCpf().equals(cpf) == true){
				return c;
			}
		}
		return null;
    }
    public String toStringCliente() {
		String aux = "";
		for(Cliente c: agenda){
			aux+= c.toString() + "\n";
		}
		return aux;
    }
}
