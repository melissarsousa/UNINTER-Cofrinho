public class Dolar extends Moeda{

	public Dolar(double valor) {
        super(valor);
    }
	
	@Override
	public double converter() {
		return valor*5.06;
	}

	@Override
	public void info() {
		System.out.println("Valor de dólares: " + valor);
	}

	@Override
	public String toString() {
		return "Dolar "+ converter() ;
	}
	
}