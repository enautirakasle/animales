
public class CíclidoCebra {

	private String especie;
	private int edad;
	private double peso;
	private boolean vivo;
	
	public void presentarme() {
		this.especie = "Cíclido Cebra";
		this.edad = 3;
		this.peso = 9.5;
		this.vivo = true;
		
		System.out.println(" Hola, soy de la especie " +this.especie+ ", tengo " +this.edad+ " y peso " +this.peso+ " gramos" );
	}
	
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isVivo() {
		return vivo;
	}

	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	
	
	
}
