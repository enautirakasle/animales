
import java.util.Date;
public class Tortuga {
	private String nombre;
	private String años;
	private Double peso;
	private  Date fechaNacimiento;
	private int cantidad;
	
	Tortuga(){
		
	}

	public Tortuga(String nombre,String años, Double peso, Date fechaNacimiento, int cantidad) {
		super();
		this.nombre = nombre;
		this.años = años;
		this.peso = peso;
		this.fechaNacimiento = fechaNacimiento;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAños() {
		return años;
	}

	public void setAños(String años) {
		this.años = años;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void presentarme() {
		System.out.println("Hola soy "+nombre+ " tengo "+años+" años ");
		System.out.println("Mi peso es de "+peso+ "y he nacido "+fechaNacimiento);
		System.out.println("Somos "+cantidad);
	}
}
