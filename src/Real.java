// Melissa Rios de Sousa
// RU: 4025304

public class Real extends Moeda{

	public Real(double valor) {
		// Chama o objeto valor da classe mãe (Moeda).
		super(valor);
	}
	
	@Override
	public double converter() {
		// Sobrescreve o método da classe mãe (Moeda).
		return valor;
	}

	@Override
	public void info() {
		// Sobrescreve o método da classe mãe (Moeda).
		System.out.println("Valor de reais: " + valor);
	}

	@Override
	public String toString() {
		// Sobrescreve o método da classe mãe (Moeda).
		return "Real: " + this.converter();
	}
	
}