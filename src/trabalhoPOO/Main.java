package trabalhoPOO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("Determine o tamanho da matriz:");
		//int tamanho = scan.nextInt();
		
		//Matrizes matrizes = new Matrizes(tamanho);
		
		//matrizes.unidimensional();
		
		//ArrayLists arrayList = new ArrayLists();
		
		//arrayList.exemploArrayList();
		
		Generics<Integer> inteiro = new Generics<>(2);
		
		inteiro.exemploGenerics();
	}

}
