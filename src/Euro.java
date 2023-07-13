// Melissa Rios de Sousa
// RU: 4025304

public class Euro extends Moeda{

	public Euro(double valor) {
		// Chama o objeto valor da classe mãe (Moeda).
		super(valor);
	}

	@Override
	public double converter() {
		// Sobrescreve o método da classe mãe (Moeda).
		return valor*5.56;
	}

	@Override
	public void info() {
		// Sobrescreve o método da classe mãe (Moeda).
		System.out.println("Valor de euros: " + valor);
	}

	@Override
	public String toString() {
		// Sobrescreve o método da classe mãe (Moeda).
		return "Euro "+ converter() ;
	}
	
}
