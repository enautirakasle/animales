package zoo;

public class Main_Eneko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animales = new Animal[5];
		animales[0] = new Elefante();
		animales[1] = new Perro("Ona", "chiuaua");
		animales[2] = new Leon(150, 1, 6);
		animales[3] = new Pinguino();
		animales[4] = new Gekko();

		for (int i = 0; i < animales.length; i++) {
			System.out.println(animales[i].getEspecie());
		}
	}

}
