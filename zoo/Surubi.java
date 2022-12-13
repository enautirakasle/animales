
public class Surubi {
	
	private String nombre;
	private String localizacion;
	private int tamaño;
	private boolean agresivo;
	
	public void presntacion(){
		this.agresivo= true;
		this.localizacion= "peru";
		this.tamaño=120;
		this.nombre= "surubi";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	public boolean isAgresivo() {
		return agresivo;
	}
	public void setAgresivo(boolean agresivo) {
		this.agresivo = agresivo;
	}
	
	
}
