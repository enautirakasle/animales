package zoo;


public class MainYaizaM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//crear un array de animales 
		
			Animal[] animales = new Animal[5]; 
			
			animales[0] = new OsoPanda("Mini", 10); 
			
			animales[1] = new Pinguino(); 
			
			animales[2] = new Lombriz(120); 
			
			animales[3] = new Rana(); 
			
			animales[4] = new Elefante("Trompy", 2); 
			
			//recorrer el array
			
			for(int i = 0; i < animales.length; i++){
				Animal animal = animales[i]; 
				animal.mostrar();
			}
	}

}
