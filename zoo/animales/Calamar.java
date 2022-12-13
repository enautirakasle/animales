import java.util.Date;

public class Calamar {
	private String subespecie;
	private String nombreOceano;
	private Date fechaCaptura;
	
	public void presentarme() {
		System.out.println("Soy un calamar de la subespecie "+ this.subespecie + " y vivo en " + this.nombreOceano);
	}
	
	public String getSubespecie() {
		return subespecie;
	}
	public void setSubespecie(String subespecie) {
		this.subespecie = subespecie;
	}
	public String getNombreOceano() {
		return nombreOceano;
	}
	public void setNombreOceano(String nombreOceano) {
		this.nombreOceano = nombreOceano;
	}
	public Date getFechaCaptura() {
		return fechaCaptura;
	}
	public void setFechaCaptura(Date fechaCaptura) {
		this.fechaCaptura = fechaCaptura;
	}

}
