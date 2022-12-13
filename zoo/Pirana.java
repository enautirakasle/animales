

public class Pirana {
	
	private String nombre;
	private String alimentacion;
	private String localizacion;
	private Integer tamaño;
	private Double peso;
	private Boolean temperamento;
	private Integer longevidad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	public Integer getTamaño() {
		return tamaño;
	}
	public void setTamaño(Integer tamaño) {
		this.tamaño = tamaño;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Boolean getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(Boolean temperamento) {
		this.temperamento = temperamento;
	}
	public Integer getLongevidad() {
		return longevidad;
	}
	public void setLongevidad(Integer longevidad) {
		this.longevidad = longevidad;
	}
	
	public void presentarme() {
		
		System.out.println("Hola, soy una piraña de acuario, me llamo " + this.nombre + " me alimento de " + this.alimentacion + 
				" habito en " + this.localizacion + " mido " + this.tamaño + "cm y peso " + this.peso + 
				"kg. Mi temperamento es " + this.temperamento + " y cuento con " + this.longevidad + " años de vida");
	}
}
