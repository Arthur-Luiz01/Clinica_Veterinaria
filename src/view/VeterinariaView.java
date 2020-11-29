package view;

import java.util.Scanner;
import model.*;
import controller.CadastroCliente;
import controller.CadastroVeterinario;

public class VeterinariaView {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Pet pet;
		AnimalSelvagem animalselvagem;
		Cliente cliente;
		Veterinario vet = null;
		CadastroCliente clientes = new CadastroCliente();
		CadastroVeterinario veterinarios = new CadastroVeterinario();
		Pet[] pets;
		String nome = "", cpf = "", codigoo ="", especie = "";
		AnimalSelvagem [] animalselvagemm;
		int opção, qtd;
		do {
			opção = Menu();
			switch (opção) {
			case 1: 
				System.out.println("Quantos pets você possui ?");
				qtd = in.nextInt();
				pets = new Pet[qtd];
				int i;
				for (i = 0; i < qtd; i++) {
					System.out.println("Informe categoria");
					String cat = in.next();
					System.out.println("Nome do pet");
					nome = in.next();
					System.out.println("Raça");
					String raca = in.next();
					System.out.println("Genero");
					char gen = in.next().charAt(0);
					pet = new Pet(cat,nome,raca,gen);
					pets[i] = pet;
				}
				System.out.println("Possui Animal Selvagem? ");
				System.out.println("Informe 'S' para sim e 'N' para não: ");
				while(opção != 'N') {
					System.out.println("Informe o código");
					codigoo = in.nextLine();
					System.out.println("Informe a Espécie:");
					especie = in.nextLine();
				}
				animalselvagemm = new AnimalSelvagem[1];
				animalselvagem = new AnimalSelvagem(codigoo,especie);
				animalselvagemm[i] = animalselvagem;
				System.out.println("Informe CPF");
				cpf = in.next();
				System.out.println("Nome do cliente");
				nome = in.next();
				cliente = new Cliente(cpf,nome,pets);
				clientes.cadastrarCliente(cliente);
				break;
			case 2: 
				clientes.exibirTodos();
				break;

			case 3:
				 System.out.println("Informe o cpf");
				 cpf = in.next();
				 clientes.remover(cpf);
				break;

			case 4: 
				System.out.println("Deseja Alterar Nome ou Pet do cliente ?");
				String opcao = in.next();
				opcao.toLowerCase();
				if (opcao.equals("nome")){
					System.out.println("Informe o cpf");
					cpf = in.next();
					clientes.alterarNome(cpf);
				} else {
					System.out.println("Informe o cpf");
					cpf = in.next();
				}
				break;
				case 5:
					System.out.println("Informe CPF");
					cpf = in.next();
					System.out.println("Informe o nome");
					nome = in.next();
					vet = new Veterinario(cpf, nome);
					veterinarios.cadastrarVet(vet);
					break;
				case 6:		
					veterinarios.exibirTodos();	
					break;
				case 7: 
					System.out.println("Informe o cpf");
					cpf = in.next();
					clientes.remover(cpf);
				case 8:	
					System.out.println("Informe o CPF do cliente");
					cpf = in.next();
					cliente = clientes.consultarCliente(cpf);
					if (cliente != null) { 	
					System.out.println("Informe o CPF do veterinario");
					cpf = in.next();
					veterinarios.consultarVeterinario(cpf, cliente);
					}
					break;
				case 9:
					System.out.println("Informe o CPF do veterinario");
					cpf = in.next();
					veterinarios.exibirClientes(cpf);
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
		System.out.println("_________________________________");
		System.out.println(" 5 - Cadastrar Veterinario");
		System.out.println(" 6 - Exibir Veterinarios");
		System.out.println(" 7 - Remover Veterinario");
		System.out.println(" 8 - Cadastrar cliente a veterinario");
		System.out.println(" 9 - Exibir clientes do veterinario");

		opção = input.nextInt();
		return opção;

	 }
}
