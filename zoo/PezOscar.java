
public class PezOscar {

	private String especie = "Pez Óscar";
	private int tamaño;
	private double peso;
	private String estado;
	private int edad;
	
	public void presentarme() {
		this.especie = "Pez Óscar";
		this.tamaño = 33;
		this.peso = 1.6;
		this.estado = "Moribundo";
		this.edad = 15;
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
