package zoo;

public abstract class Animal {

	private String especie;
	private int patas;

	public Animal() {

	}

	public Animal(String especie, int patas) {
		this.especie = especie;
		this.patas = patas;
	}

	public abstract void mostrar();

	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return especie;
	}

	/**
	 * @param especie
	 *            the especie to set
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}

	/**
	 * @return the patas
	 */
	public int getPatas() {
		return patas;
	}

	/**
	 * @param patas
	 *            the patas to set
	 */
	public void setPatas(int patas) {
		this.patas = patas;
	}

}
