
public class Foca {
	private String nombre;
	private String nombreCientifico;
	private String clase;
	private String alimentacion;
	private double largo;
	private double edad;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	
	public String getClase() {
		return clase;
	}
	
	public void setClase(String clase) {
		this.clase = clase;
	}
	
	public String getAlimentacion() {
		return alimentacion;
	}
	
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	public double getLargo() {
		return largo;
	}
	
	public void setLargo(double largo) {
		this.largo = largo;
	}
	
	public double getEdad() {
		return edad;
	}
	
	public void setEdad(double edad) {
		this.edad = edad;
	}

	public void presentarme() {
		System.out.println("Soy una foca gordita");
	}
}
