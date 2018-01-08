package zoo;

public class MainEnaut {

	public static void main(String[] args) {
		Animal[] animales = new Animal[5];
		
		animales[0] = new Pinguino();
		animales[1] = new Mono();
		animales[2] = new Elefante();
		animales[3] = new Leon();
		animales[4] = new OsoPanda();
		
		for (int i = 0; i < animales.length; i++) {
			Animal animal = animales[i];
			animal.mostrar();
		}

	}

}
