// Melissa Rios de Sousa
// RU: 4025304

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	// Cria um ArrayList privado.
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// Método de adicionar moeda no cofrinho.
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}

	// Método de remover moeda no cofrinho.
	public void remover(Moeda moeda) {
		// Cria iterator para poder comparar o valor no cofrinho e o valor digitado pelo usuário.
	    Iterator<Moeda> iterator = this.listaMoedas.iterator();
	        
		while (iterator.hasNext()){
			Moeda iteratorMoeda = iterator.next();

			if (iteratorMoeda.toString().equals(moeda.toString())){ // Compara o valor no cofrinho e o digitado.
				iterator.remove();
				return;
			}
		}

		System.out.println("Não foi possível remover o valor do cofrinho.");
		// O valor digitado é diferente do valor no cofrinho.
	
	}
	public void listagemMoedas() {
		// Lista as moedas, a partir do método info() das classes de Moedas.
		for(Moeda m : listaMoedas) {
			m.info();
		}
	}
	 public double converterMoedas() {
		// Converte as moedas, a partir do método converter() das classes de Moedas.
		 double total = 0;
	     for(Moeda m : listaMoedas) {
	         total += m.converter();
	     }
	     System.out.println("Total: " + total);
	     return total;
	 }
	
}
