package trabalhoPOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
	public void exemploArrayList() {
		//Instanciando objeto 'scan' da classe Scanner para ler o terminal
		Scanner scan = new Scanner(System.in);
		//Definindo variável global 'opcao' para usar no do-while
		char opcao;
		
		//Instanciando um objeto 'pessoas' do tipo ArrayList<String>
		ArrayList<String> pessoas = new ArrayList<>();
		
		//Adicionando pessoas em 'pessoas'
		pessoas.addAll(Arrays.asList("ARTHUR", "KIKO", "BOLI", "ADINEI", "RAPHAEL", "RANIEL", "VINICIUS"));

		//Imprimindo tamanho inicial da lista
		System.out.println(pessoas + "\nTamanho inicial da lista: " + pessoas.size());

		do {
			//Criando um menu de opções para adicionar e remover pessoas usando do-while
			char add;
			System.out.println("\nGostaria de remover ou adicionar uma pessoa? (R - Remover / A - Adicionar):");
			do {
				add = scan.next().charAt(0);
				
				//Verificando se a entrada do teclado é 'R' || 'r' para remover uma pessoa
				if (add == 'R' || add == 'r') {
					System.out.printf("\nRemova uma pessoa da lista ('Digite o nome da pessoa'):\n");
					String pessoa = scan.next();
					
					//Utilizando o método 'contains' para verificar se o nome digitado está na lista
					if (pessoas.contains(pessoa.toUpperCase())) {
						//Utilizando o método 'remove' para remover a entrada da lista
						pessoas.remove(pessoa.toUpperCase());
					} else {
						System.out.println("Não foi encontrada uma pessoa com o nome: " + pessoa);
					}
				}
				
				//Verificando se a entrada do teclado é 'A' || 'a' para adicionar uma pessoa
				if (add == 'A' || add == 'a') {
					System.out.printf("\nAdicione uma pessoa da lista ('Digite o nome da pessoa'):\n");
					String pessoa = scan.next();

					//Utilizando o método 'add' para adicionar a entrada na lista
					pessoas.add(pessoa.toUpperCase());
				}
				if (add != 'A' && add != 'a' && add != 'r' && add != 'R') {
					System.out.println("Selecione uma opção válida!");
				}
			} while (add != 'A' && add != 'a' && add != 'r' && add != 'R');

			//Imprimindo pessoas da lista e tamanho atual
			System.out.printf(
					pessoas + "\nTamanho da lista: " + pessoas.size() + "\nDeseja continuar? ( N - Não / Sim - S):\n");
			do {
				opcao = scan.next().charAt(0);
				if (opcao != 'n' && opcao != 'N' && opcao != 's' && opcao != 'S') {
					System.out.println("Selecione uma opção válida!");
				}
			} while (opcao != 'N' && opcao != 'n' && opcao != 'S' && opcao != 's');
		} while (opcao != 'N' && opcao != 'n');

		// Usando forEach para mostrar a lista final
		System.out.println("Lista final de pessoas: ");
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
		//Imprimindo o tamanho final da lista
		System.out.println("Tamanho final da lista: " + pessoas.size());
	}

}
