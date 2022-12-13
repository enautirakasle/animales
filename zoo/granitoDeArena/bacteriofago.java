package granitoDeArena;

public class bacteriofago {
	private double tamaño, muerde,estomago;

	private bacteriofago() {
		this.tamaño = 0.00002;
		this.estomago = 100;
	}

	public double getSeCome() {
		return muerde;
	}

	public void setSeCome(double seCome) {
		if (seCome > tamaño * 200) {
			this.muerde = 0;
		} else {
			this.muerde = (seCome/tamaño) / 20;
		}
	}
	public double metaboliza() {
		this.estomago+=muerde;
		estomago--;
		return muerde;
	}

}
