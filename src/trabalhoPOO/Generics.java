package trabalhoPOO;

//Criando uma classe 'Generics' que espera receber um tipo <T>
public class Generics<T> {
	//Criando atributo 'objeto' com base no tipo <T> recebido
	private T objeto;
	
	//Método get para retornar 'objeto'
	public T getObjeto() {
		return objeto;
	}

	//Definindo um construtor que atribui o valor de 'objeto'
	public Generics(T objeto) {
		this.objeto = objeto;
	}

	//Método para imprimir o valor do objeto e o tipo
	public void exemploGenerics() {
		System.out.printf("\nValor do objeto: " + objeto + "\nTipo do objeto: " + objeto.getClass() + "\n");
	}
}
