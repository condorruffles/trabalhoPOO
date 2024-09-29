package trabalhoPOO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
	public void exemploArrayList() {
		Scanner scan = new Scanner(System.in);
		char opcao;
		ArrayList<String> pessoas = new ArrayList<>();

		pessoas.addAll(Arrays.asList("ARTHUR", "KIKO", "BOLI", "ADINEI", "RAPHAEL", "RANIEL", "VINICIUS"));

		System.out.println(pessoas + "\nTamanho da lista: " + pessoas.size());

		do {
			char add;
			System.out.println("\nGostaria de remover ou adicionar uma pessoa? (R - Remover / A - Adicionar):");
			do {
				add = scan.next().charAt(0);
				if (add == 'R' || add == 'r') {
					System.out.printf("\nRemova uma pessoa da lista ('Digite o nome da pessoa'):\n");
					String pessoa = scan.next();
					if (pessoas.contains(pessoa.toUpperCase())) {
						pessoas.remove(pessoa.toUpperCase());
					} else {
						System.out.println("Não foi encontrada uma pessoa com o nome: " + pessoa);
					}
				}

				if (add == 'A' || add == 'a') {
					System.out.printf("\nAdicione uma pessoa da lista ('Digite o nome da pessoa'):\n");
					String pessoa = scan.next();

					pessoas.add(pessoa.toUpperCase());
				}

				if (add != 'A' && add != 'a' && add != 'r' && add != 'R') {
					System.out.println("Selecione uma opção válida!");
				}
			} while (add != 'A' && add != 'a' && add != 'r' && add != 'R');

			System.out.printf(
					pessoas + "\nTamanho da lista: " + pessoas.size() + "\nDeseja continuar? ( N - Não / Sim - S):\n");
			do {
				opcao = scan.next().charAt(0);
				if (opcao != 'n' && opcao != 'N' && opcao != 's' && opcao != 'S') {
					System.out.println("Selecione uma opção válida!");
				}
			} while (opcao != 'N' && opcao != 'n' && opcao != 'S' && opcao != 's');
		} while (opcao != 'N' && opcao != 'n');

		// Usando forEach para mostrar a lista
		System.out.println("Lista final de pessoas: ");
		for (String pessoa : pessoas) {
			System.out.println(pessoa);
		}
		System.out.println("Tamanho final da lista: " + pessoas.size());
	}

}
