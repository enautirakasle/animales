package zoo;

public class Main_Robert {
	public static void main(String[] args) {

		Animal[] animales = new Animal[5];
		animales[0] = new Lombriz();
		animales[1] = new Mono();
		animales[2] = new Rana();
		animales[3] = new Perro(null, null);
		animales[4] = new Elefante();

		for (int i = 0; i < animales.length; i++) {
			animales[i].mostrar();
		}

	}

}
