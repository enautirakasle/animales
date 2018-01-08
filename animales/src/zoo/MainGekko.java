package zoo;

public class MainGekko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gekko g = new Gekko();

		g.setCantidadDedos(5);
		g.setLongitud(20);
		g.setPeso(200);
		g.setPegado(true);
		g.despegarse();
		g.setRotacion(90);
		g.pegarse();
		g.despegarse();
		g.setRotacion(50);
		g.despegarse();
		g.Andar();
		System.out.println(g.getEspecie());
		System.out.println("Pegado? --> " + g.isPegado());
		System.out.println(g.getLongitud() + "cm de longitud.");
		System.out.println(g.getPatas() + " patas.");
		System.out.println(g.getPeso() + "gr.");
		System.out.println(g.getRotacion() + "º de rotación");
		g.setCantidadDedos(2);
		g.pegarse();
		g.mostrar();

	}

}
