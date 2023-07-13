import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	public void remover(Moeda moeda) {
	    Iterator<Moeda> iterator = this.listaMoedas.iterator();
	        
		while (iterator.hasNext()){
			Moeda iteratorMoeda = iterator.next();

			if (iteratorMoeda.toString().equals(moeda.toString())){
				iterator.remove();
				return;
			}
		}

		System.out.println("Não foi possível remover o valor do cofrinho.");
	
	}
	public void listagemMoedas() {
		for(Moeda m : listaMoedas) {
			m.info();
		}
	}
	 public double converterMoedas() {
		 double total = 0;
	     for(Moeda m : listaMoedas) {
	         total += m.converter();
	     }
	     System.out.println("Total: " + total);
	     return total;
	 }
	
}
