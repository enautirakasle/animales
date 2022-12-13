

public class Gamba {
	private String nombre;
	private int edad;
	private double tamano;
	private String color;
	private String chiste;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getTamano() {
		return tamano;
	}
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getChiste() {
		return chiste;
	}
	public void setChiste(String chiste) {
		this.chiste = chiste;
	}
	
	public String presentarse() {
		return "Hola, soy una " + this.nombre + ". Tengo " + edad + " años. Mido " + this.tamano + " y soy de color " + this.color + ". Aquí un chiste: " + this.chiste; 
	}
	
	
}
