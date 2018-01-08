package zoo;

public class MainIbaiA {

	public static void main(String[] args) {

		
		Animal[] animales = new Animal[5];
		
		animales[0] = new Mono("ibai", "chimpance");
		animales[1] = new Leon(240, 120, 10);
		animales[2] = new Elefante("rosa", 2);
		
		for(int i=0; i< animales.length;i++){
			animales[i].mostrar();
		}//Cierra for
	}

}
