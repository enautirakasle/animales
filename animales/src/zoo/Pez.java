package zoo;

public class Pez extends Animal {
	
	Pez() {
		super("pez", 0);
	}

	@Override
	public void mostrar() {
		System.out.println(super.getEspecie() + " : "+ super.getPatas());
		
	}

}
