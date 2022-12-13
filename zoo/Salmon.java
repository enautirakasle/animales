public class Salmon {
	private String tipoDePescado;
	private String aguaQmeGusta;
	int peso;
	double tamaño;
	public void presentarme() {
		this.tamaño = 120.5;
		this.peso = 35;
		this.tipoDePescado = "azul";
		this.aguaQmeGusta = "salada";
		System.out.println("Hola, soy un salmón\n soy carne " + tipoDePescado + "\nvivo en agua" + aguaQmeGusta
				+ "\npeso " + peso + "kg" + "\ny mido " + tamaño + "cm\n ¡Es un placer conocerte!");
	}
	public String getTipoDePescado() {
		return tipoDePescado;
	}
	public void setTipoDePescado(String tipoDePescado) {
		this.tipoDePescado = tipoDePescado;
	}
	public String getAguaQmeGusta() {
		return aguaQmeGusta;
	}
	public void setAguaQmeGusta(String aguaQmeGusta) {
		this.aguaQmeGusta = aguaQmeGusta;
	}
}