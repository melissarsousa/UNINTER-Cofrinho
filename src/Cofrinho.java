import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	public void remover(double valor) {
	    for (Moeda moeda : listaMoedas) {
	        if (moeda.getValor() == valor) {
	            listaMoedas.remove(moeda);
	            return;
	        }
            else if (moeda.getValor() != valor && moeda.getValor() != 0) {
                double total = moeda.getValor();
                double valorFinal = total - valor;
                return;
            }
            else {
                System.out.println("Cofrinho vazio.");
            }
	    }
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
