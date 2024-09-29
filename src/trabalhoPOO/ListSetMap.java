package trabalhoPOO;

import java.util.*;

public class ListSetMap {
	
	public void exemplos() {
		this.exemploLista();
		this.exemploSet();
		this.exemploMap();
	}
	
	private void exemploLista() {
		List<String> convidados = new ArrayList<>();
		convidados.addAll(Arrays.asList("David", "Raniel", "Maria", "Raniel"));

		System.out.printf("\nExemplo de List:\n");
		System.out.println("Lista de convidados:");
		for (String convidado : convidados) {
			System.out.println(convidado);
		}
	}
	private void exemploSet() {
		Set<String> convidados = new HashSet<>();
		convidados.addAll(Arrays.asList("David", "Raniel", "Maria", "Raniel"));

		System.out.printf("\nExemplo de Set:\n");
		System.out.println("Lista de convidados:");
		for (String convidado : convidados) {
			System.out.println(convidado);
		}
	}
	private void exemploMap() {
		Map<String, String> dicionario = new HashMap<>();
		dicionario.put("Developer", "Desenvolvedor");
		dicionario.put("System", "Sistema");
		dicionario.put("Object", "Objeto");
		
		System.out.printf("\nExemplo de Map:\n");
		System.out.println("Tradução de 'Developer' -> " + dicionario.get("Developer"));
		System.out.println("Tradução de 'System' -> " + dicionario.get("System"));
		System.out.println("Tradução de 'Object' -> " + dicionario.get("Object"));
	}
}
