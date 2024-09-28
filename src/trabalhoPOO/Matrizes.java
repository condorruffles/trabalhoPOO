package trabalhoPOO;

public class Matrizes {
	
	private int index;
	
	public Matrizes(int index) {
		this.index = index;
	}
	
	public void unidimensional() {
		int[] vetor = new int[index];
		
		System.out.println("Números impares de 1 até " + index + ": ");
		for(int i = 0; i < index; i++) {
			vetor[i] = i + 1;
			if(vetor[i] % 2 != 0) {
				System.out.print(vetor[i]);
					System.out.print(" ");
			}
		}
	}
	
	public void bidimensional() {
		int [][] matriz = new int[index][index];
		int cont = 1;
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		for(int i = 0; i < index; i++)	{
			for(int j = 0; j < index; j++) {
				matriz[i][j] = cont;
				System.out.print(matriz[i][j] + " ");
				cont++;
			}
			System.out.println();
			somaPrincipal += matriz[i][i];
			somaSecundaria += matriz[i][index - 1 - i];
		}
		System.out.printf("Soma diagonal Principal: " + somaPrincipal + "\nSoma diagonal Secundária: " + somaSecundaria);
	}
}
