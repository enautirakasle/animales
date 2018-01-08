package zoo;

public class Main_Ander_L {

	public static void main(String[] args) {

		Animal[] animales = new Animal[5];

		animales[0] = new Pinguino();

		animales[1] = new Leon();

		animales[2] = new Rana();

		animales[3] = new OsoPanda();

		animales[4] = new Pez();

		for (int i = 0; i < animales.length; i++) {

			System.out.println(animales[i].getEspecie());
		}

	}

}
