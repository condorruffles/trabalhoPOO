package trabalhoPOO;

public class Generics<T> {
	private T objeto;
	
	public T getObjeto() {
		return objeto;
	}

	public Generics(T objeto) {
		this.objeto = objeto;
	}
	
	public void exemploGenerics() {
		System.out.printf("\nValor do objeto: " + objeto + "\nTipo do objeto: " + objeto.getClass() + "\n");
	}
}
