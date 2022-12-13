
public class PezOscar {

	private String especie = "Pez Óscar";
	private int tamaño;
	private double peso;
	private int edad;
	private String estado;
	
	public void presentarme() {
		this.especie = "Pez Óscar";
		this.tamaño = 33;
		this.peso = 1.6;
		this.estado = "Moribundo";
		this.edad = 15;
		
		System.out.println("Hola, soy un " + this.especie + ", mido " + this.tamaño + " CMs, peso " + this.peso + " KGs, tengo " + this.edad + " años y estoy " + this.estado);
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
