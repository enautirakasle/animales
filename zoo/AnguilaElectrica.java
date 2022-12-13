
public class AnguilaElectrica {
	
	private String tipo;
	private String especie;
	private Double peso;
	private String color;
	private int edad;
	private String habitat;
	private String voltaje;
	private String estado;
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEspecia() {
		return especie;
	}
	public void setEspecia(String especia) {
		this.especie = especia;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	
	public void presentarme() {
		this.tipo = "Animal acuatico";
		this.edad = 2;
		this.voltaje = "2v";
		this.estado = "Sano";
		this.peso = 3.2;
		this.habitat = "Mar pacifico";
		this.especie = "Pez";
		this.color = "Azul";
		
		System.out.println("Hola soy una Anguila Electrica y soy un "+this.tipo+" de la especie "+this.especie+". Tengo "+this.edad+" años y soy de color "+this.color+
				". Tengo un voltaje de "+this.voltaje+". Peso "+this.peso+" y estoy "+this.estado+". Vivo en el "+this.habitat);
		
	}
}
