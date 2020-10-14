package Main;

import java.util.Scanner;
import Classes.*;
import Cadastro.CadastroCliente;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pet pet;
		Cliente cliente;
		CadastroCliente clientes = new CadastroCliente();
		Pet[] pets;
		int opção, qtd;
		do {
			opção = Menu();
			switch (opção) {
			case 1: 
				System.out.println("Quantos pets você possui ?");
				qtd = in.nextInt();
				pets = new Pet[qtd];
				for (int i = 0; i < qtd; i++) {
					System.out.println("Informe categoria");
					String cat = in.next();
					System.out.println("Nome do pet");
					String nome = in.next();
					System.out.println("Raça");
					String raca = in.next();
					System.out.println("Genero");
					char gen = in.next().charAt(0);
					pet = new Pet(cat,nome,raca,gen);
					pets[i] = pet;
				}
				System.out.println("Informe CPF");
				String cpf = in.next();
				System.out.println("Nome do cliente");
				String nome = in.next();
				cliente = new Cliente(cpf,nome,pets);
				clientes.cadastrarCliente(cliente);
				break;
			case 2: 
				clientes.exibirTodos();
				break;

			case 3:
				 System.out.println("Informe o cpf");
				 String cp = in.next();
				 clientes.remover(cp);
				break;

			case 4: 
				System.out.println("Deseja Alterar Nome ou Pet do cliente ?");
				String cpff;
				String opcao = in.next();
				opcao.toLowerCase();
				if (opcao.equals("nome")){
					System.out.println("Informe o cpf");
					cpff = in.next();
					clientes.alterarNome(cpff);
				} else {
					System.out.println("Informe o cpf");
					cpff = in.next();
				}
				break;
				case 0:
				System.out.println("Finalizando...");
				break;
			default:
				System.out.println("Opcao invalida");

			} // FIM SWITCH

		} while (opção != 0);

	} 
	// Menu
	public static int Menu() {

		Scanner input = new Scanner(System.in);
		int opção;

		System.out.println(" ***** Sistema Veterinario *****");
		System.out.println(" 1 - Cadastrar Cliente ");
		System.out.println(" 2 - Exibir Clientes ");
		System.out.println(" 3 - Remover Cliente");
		System.out.println(" 4 - Alterar dados do Cliente");

		opção = input.nextInt();
		return opção;

	 }
}
