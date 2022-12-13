import javax.swing.JOptionPane;

public class MainJulenCano {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "¿Acepta los terminos y condiciones?");
		String tmp =JOptionPane.showInputDialog(null, "Introduzca nombre de su asistente virtual");
		JOptionPane.showMessageDialog(null, tmp + " no se encuentra disponible en este momento, espere a la siguiente actualizacion");
	}
}			