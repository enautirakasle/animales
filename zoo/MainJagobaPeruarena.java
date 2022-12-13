
public class MainJagobaPeruarena{

	public static void main(String[] args) {
	
		PezOso pOso = new PezOso();
	
		pOso.setNombre("Gende");
		pOso.setEstado("Muerto");
		pOso.setNombreCientifico("PeoplusVagusMaximus");
		pOso.setAlimentacion("Leones");
		pOso.setTamaño("THICCKK");
		pOso.presentarme();
		System.out.println("Estoy DUMMY "+pOso.getTamaño()+" a base de comer "+pOso.getAlimentacion());


	}
}