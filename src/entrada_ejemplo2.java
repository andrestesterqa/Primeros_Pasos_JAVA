import javax.swing.*;

public class entrada_ejemplo2 {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		int edad_usuario = Integer.parseInt(edad);
		
		//edad_usuario++;
		
		System.out.println("Hola " + nombre_usuario + ". Este a�o vas a cumplir " + (edad_usuario+1) + " a�os");

	}

}
