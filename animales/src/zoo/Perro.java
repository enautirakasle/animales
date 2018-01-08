package zoo;

public class Perro extends Animal {

	/*
	 * atributos 
	 * 
	 */

	private String raza;
	private String color;
	private String nombre;
	
	/*
	 * metodo constructor y métodos
	 */
	
	//constructor
	
	public Perro(String nombre, String raza) {
		super("perro", 2);
		this.nombre=nombre;
	}
	

	/* (non-Javadoc)
	 * @see zoo.Animal#mostrar()
	 */
	public void mostrar() {

		System.out.println("Soy " + nombre + " y soy un perro de la raza " + raza);
	}
	
	
	/*
	 * getters y setters
	 */
	
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
