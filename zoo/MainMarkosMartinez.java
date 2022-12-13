import java.util.Scanner;

public class MainMarkosMartinez {

	public static void main(String[] args) {
		PezOscar pezoscar = new PezOscar();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe el nombre de especie: ");
		pezoscar.setEspecie(scan.nextLine());
		
		System.out.println("Escribe el tamaño: ");
		pezoscar.setTamaño(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Escribe el Peso: ");
		pezoscar.setPeso(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Escribe el estado del pez: ");
		pezoscar.setEstado(scan.nextLine());
		
		System.out.println("Escribe la edad del pez: ");
		pezoscar.setEdad(Integer.parseInt(scan.nextLine()));
		
		
		
		scan.close();
		pezoscar.presentarme();
		
		

	}

}
