// Melissa Rios de Sousa
// RU: 4025304

public class Dolar extends Moeda{

	public Dolar(double valor) {
		// Chama o objeto valor da classe mãe (Moeda).
        super(valor);
    }
	
	@Override
	public double converter() {
		// Sobrescreve o método da classe mãe (Moeda).
		return valor*5.06;
	}

	@Override
	public void info() {
		// Sobrescreve o método da classe mãe (Moeda).
		System.out.println("Valor de dólares: " + valor);
	}

	@Override
	public String toString() {
		// Sobrescreve o método da classe mãe (Moeda).
		return "Dolar "+ converter() ;
	}
	
}