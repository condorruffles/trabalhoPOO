package trabalhoPOO;

import java.util.*;

public class ListSetMap {
	
	//Método público para impressão dos exemplos
	public void exemplos() {
		this.exemploLista();
		this.exemploSet();
		this.exemploMap();
	}
	
	//Método com exemplo de uso de Lista
	private void exemploLista() {
		//Instanciando um objeto 'convidado' do tipo ArrayList que implementa a interface de List<T>
		List<String> convidados = new ArrayList<>();
		
		//Adicionando pessoas na lista de convidados
		convidados.addAll(Arrays.asList("David", "Raniel", "Maria", "Raniel"));

		//Imprimindo lista dos convidados
		System.out.printf("\nExemplo de List:\n");
		System.out.println("Lista de convidados:");
		//Utilizando forEach para imprimir cada convidado da lista
		for (String convidado : convidados) {
			System.out.println(convidado);
		}
	}
	private void exemploSet() {
		//Instanciando um objeto 'convidado' do tipo HashSet que implementa a interface de Set<T>
		Set<String> convidados = new HashSet<>();
		//Adicionando pessoas na lista de convidados
		convidados.addAll(Arrays.asList("David", "Raniel", "Maria", "Raniel"));

		//Imprimindo lista dos convidados
		System.out.printf("\nExemplo de Set:\n");
		System.out.println("Lista de convidados:");
		//Utilizando forEach para imprimir cada convidado da lista
		for (String convidado : convidados) {
			System.out.println(convidado);
		}
	}
	private void exemploMap() {
		//Instanciando um objeto 'dicionario' do tipo HashMap que implementa a interface de Map<T,T>
		Map<String, String> dicionario = new HashMap<>();
		//Referenciando a tradução de cada dado recebido
		dicionario.put("Developer", "Desenvolvedor");
		dicionario.put("System", "Sistema");
		dicionario.put("Object", "Objeto");
		
		//Imprimindo exemplos do Map
		System.out.printf("\nExemplo de Map:\n");
		System.out.println("Tradução de 'Developer' -> " + dicionario.get("Developer"));
		System.out.println("Tradução de 'System' -> " + dicionario.get("System"));
		System.out.println("Tradução de 'Object' -> " + dicionario.get("Object"));
	}
}
