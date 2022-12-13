/**
 * 
 */

/**
 * @author Santiago Martin
 *
 */
public class MacacoNarigudo {

	private String nombrecientifico;
	private String habitat;
	private double peso;
	private int altura;
	private int longitudcola;
public void presentarme() {
	System.out.println("Hola , Soy un macaco narigudo! mi nombre 100tifico es: " + this.nombrecientifico + " vivo en " + this.habitat + "peso " + this.peso + "kg" + " mido " + this.altura + "cm" + " y la cola me mide :" + this.longitudcola + "cm" );
}

public String getNombrecientifico() {
	return nombrecientifico;
}
public void setNombrecientifico(String nombrecientifico) {
	this.nombrecientifico = "Nasalis larvatus";
}

public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = "la isla de Borneo, en el sureste asiático.";
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = 20;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = 70;
}
public int getLongitudcola() {
	return longitudcola;
}
public void setLongitudcola(int longitudcola) {
	this.longitudcola = 75;
}

}
