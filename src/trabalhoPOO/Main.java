package trabalhoPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op;
		int tamanho;
		char SN;

		System.out.printf("--- Trabalho de POO: ---\n\n");
		System.out.println("Selecione o conteúdo:");
		do {
			boolean executed = false;
			System.out.printf(
					"\n1- Matriz unidimensional \n2- Matriz Bidimensional \n3- Generics \n4- Lists, Sets e Maps \n5- ArrayLists\n");
			op = scan.nextInt();
			switch (op) {
			case 1:
				System.out.printf("\n--- Matriz unidimensional ---\n");
				System.out.println("Digite o tamanho do vetor:");
				tamanho = scan.nextInt();
				Matriz vetor = new Matriz(tamanho);

				vetor.unidimensional();
				break;

			case 2:
				System.out.printf("\n--- Matriz bidimensional ---\n");
				System.out.println("Digite o tamanho da matriz:");
				tamanho = scan.nextInt();
				Matriz matriz = new Matriz(tamanho);

				matriz.bidimensional();
				break;

			case 3:
				System.out.printf("\n--- Generics ---\n");
				System.out.println("Nesse exemplo foi utilizado o tipo 'Integer':");

				Generics<Integer> inteiro = new Generics<>(5);

				inteiro.exemploGenerics();

				break;

			case 4:
				ListSetMap listSetMap = new ListSetMap();

				listSetMap.exemplos();
				break;
			case 5:
				ArrayLists arrayList = new ArrayLists();

				arrayList.exemploArrayList();
				break;
			default:
				executed = true;
				System.out.println("Selecione uma opção válida!");
				break;
			}
			if (executed == false) {
				System.out.println("Deseja executar novamente?(S- Sim / N- Não):");
				do {
					SN = scan.next().charAt(0);
					if (SN == 'S' || SN == 's') {
						op = 6;
					} else if (SN != 'n' && SN != 'N') {
						System.out.println("Selecione uma opção válida");
					}

				} while (SN != 's' && SN != 'S' && SN != 'n' && SN != 'N');
			}
		} while (op < 1 || op > 5);
		System.out.println("Execução finalizada!");
		scan.close();
	}

}
