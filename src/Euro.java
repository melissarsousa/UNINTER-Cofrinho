public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public double converter() {
		return valor*5.56;
	}

	@Override
	public void info() {
		System.out.println("Valor de euros: " + valor);
	}

	@Override
	public String toString() {
		return "Euro "+ converter() ;
	}
	
}
