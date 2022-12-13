public class Gato {
	private int vidas;
	
	public Gato() {
		this.vidas = 7;
	}
	
	public int getVidas() {
		return vidas;
	}


	public void setVidas(int vidas) {
		this.vidas = vidas;
	}


	public void presentarme() {
		System.out.println("miau miau");
	}
	
}
