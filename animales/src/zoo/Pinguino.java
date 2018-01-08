package zoo;

public class Pinguino extends Animal {

	private String tipoComida;
	private boolean vuela;
	private boolean alas;

	public Pinguino() {

		super("pingüino", 2);
		this.tipoComida = "pescado";
		this.alas = true;
		this.vuela = true;

	}

	// Getters y setters
	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	public boolean isAlas() {
		return alas;
	}

	public void setAlas(boolean alas) {
		this.alas = alas;
	}

	@Override
	public void mostrar() {
		String volar = "";
		if (vuela == true) {
			volar = "vuelo";

		} else
			volar = "no vuelo";

		String alado = "";
		if (alas == true) {
			alado = " tengo alas";
		} else {
			alado = " no tengo alas";
		}
		System.out.print(volar);
		System.out.print(alado);
		System.out.print(" y como " + getTipoComida());
	}

}
