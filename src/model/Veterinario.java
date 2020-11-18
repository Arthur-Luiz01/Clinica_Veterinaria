package model;
import java.util.ArrayList;
public class Veterinario implements Comparable<Veterinario> {
    private String cpf;
    private String nome;
    private ArrayList<Cliente> atendimentos;
    public Veterinario(String cpf, String nome){
        this.cpf = cpf;
        this.nome =  nome;
        atendimentos = new ArrayList<>();
    }
    public String getNome () {
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public String getCpf () {
        return cpf;
    }
    public void setCpf (String cpf) {
        this.cpf = cpf;
    }
    public void novoAtendimento(Cliente cliente){
        atendimentos.add(cliente);
    }
    @Override
    public String toString() {
        String aux = "";

        for(Cliente c: atendimentos){
			aux+= c.toString() + "\n";
		}
        return "Atendimentos: "+ aux + "\n" +
                "CPF: " + this.cpf + "\n" + 
                "Nome: " + this.nome;
    }
    @Override
	public int compareTo(Veterinario a) {
		return this.cpf.compareTo(a.getCpf());
		
	}
    
}
