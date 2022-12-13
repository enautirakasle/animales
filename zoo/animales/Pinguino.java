
public class Pinguino {
	
	private String nombre;
	private int edad;
	private String lugarProcedencia;
	private String color;
	
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
	public String getLugarProcedencia() {
		return lugarProcedencia;
	}
	public void setLugarProcedencia(String lugarProcedencia) {
		this.lugarProcedencia = lugarProcedencia;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void presentarse() {
		System.out.println("Hola soy un pinguino, me llamo " + this.nombre + " y tengo " + this.edad + " años, "
				+ "soy de color " + this.color + " y vengo desde " + this.lugarProcedencia);
	}
	
}
