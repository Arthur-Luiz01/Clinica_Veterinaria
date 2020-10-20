package cadastro;
import java.util.*;
import classes.Veterinario;
import classes.Cliente;
public class CadastroVeterinario {
    Scanner in = new Scanner(System.in);
    ArrayList<Veterinario> veterinarios = new ArrayList();
    
    public void cadastrarVet(Veterinario vet) {
		veterinarios.add(vet);
    }
    public void exibirTodos() {
		int n = veterinarios.size();
		for (int i=0; i<n; i++) {
		  System.out.println(veterinarios.get(i));
		}
	}
	public void remover (String cpf) {
		
		for (Veterinario v: veterinarios){
			if(v.getCpf().equals(cpf) == true) {
				veterinarios.remove(veterinarios.indexOf(v));
			}
		}
	}
	public void consultarVeterinario (String cpf, Cliente cliente) {
		for (Veterinario v: veterinarios){
			if(v.getCpf().equals(cpf) == true){
				v.novoAtendimento(cliente);
			}
		}
	}
	public void exibirClientes (String cpf) {
		for (Veterinario v: veterinarios){
			if(v.getCpf().equals(cpf) == true){
				System.out.println(veterinarios.get(veterinarios.indexOf(v)));
			}
		}
	}
	@Override
	public String toString () {
		String aux = "";
		for(Veterinario v: veterinarios){
			aux+= v.toString() + "\n";
		}
		return aux;
	}
}
