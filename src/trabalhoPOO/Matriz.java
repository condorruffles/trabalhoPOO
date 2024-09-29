package trabalhoPOO;

public class Matriz {
	
	//Declarando atributo da classe
	private int index;
	
	//Definindo um construtor que estabelece o tamanho das matrizes quando são instanciadas
	public Matriz(int index) {
		this.index = index;
	}
	
	//Método de exemplo de matriz unidimensional(vetor) que verifica
	//a quantidade de números impares de 1 até o número instanciado
	public void unidimensional() {
		//Declarando vetor
		int[] vetor = new int[index];
		
		System.out.println("Números impares de 1 até " + index + ": ");
		//Preenchendo vetor e imprimindo na tela utilizano um laço FOR com index definido
		for(int i = 0; i < index; i++) {
			vetor[i] = i + 1;
			if(vetor[i] % 2 != 0) {
				System.out.print(vetor[i]);
					System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	//Método de exemplo de matriz bidimensional que preenche a matriz e
	//verifica a soma de suas diagonais principal e secundária
	public void bidimensional() {
		//Declarando matriz e variáveis necessárias
		int [][] matriz = new int[index][index];
		int cont = 1;
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		//Preenchendo matriz e imprimindo na tela utilizano um laço FOR com index definido
		for(int i = 0; i < index; i++)	{
			for(int j = 0; j < index; j++) {
				matriz[i][j] = cont;
				System.out.print(matriz[i][j] + " ");
				cont++;
			}
			System.out.println();
			
			//Somando as diagonais principal e secundária da matriz
			somaPrincipal += matriz[i][i];
			somaSecundaria += matriz[i][index - 1 - i];
		}
		//Imprimindo a soma das diagonais principal e secundária da matriz
		System.out.printf("Soma diagonal Principal: " + somaPrincipal + "\nSoma diagonal Secundária: " + somaSecundaria + "\n");
	}
}
