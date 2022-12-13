
public class Pulpo {
	
	private String nombre;
	private String nombreCientifico;
	private String color;
	private String agua;
	private int edad;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAgua() {
		return agua;
	}
	public void setAgua(String agua) {
		this.agua = agua;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Pulpo(String nombre, String nombreCientifico, String color, String agua, int edad) {
		super();
		this.nombre = nombre;
		this.nombreCientifico = nombreCientifico;
		this.color = color;
		this.agua = agua;
		this.edad = edad;
	}
	public String presentarme() {
		return "Hoola, me llamo "+nombre + ", soy un pulpo o " + nombreCientifico + ", soy de color " + color + " y vivo en aguas " + agua + ". Tengo  " + edad +" años" ;
	}
	
	
}
