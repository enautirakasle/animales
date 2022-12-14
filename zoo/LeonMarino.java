import javax.swing.*;
public class LeonMarino {
	private String nombre;
	private String color;
	private double peso;
	private double velocidad;
	private int edad;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void presentarse(String nombre, String color, double peso, double velocidad, int edad) {
		JOptionPane.showMessageDialog(null, "Hola soy "+this.nombre+ " soy del color "+this.color+ " mi peso es de "+peso+ " mi velocidad es "+velocidad+" y mi edad es de "+edad);
	}
}
