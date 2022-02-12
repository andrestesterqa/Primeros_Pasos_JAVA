
public class ClasesString {

	public static void main(String[] args) {
		
		String mi_nombre = "Andrés Hernández";
		
		System.out.println("Mi nombre es " + mi_nombre);
		
		System.out.println("Mi nombre tiene " + mi_nombre.length() + " letras");
		
		System.out.println("La primera letra de mi nombre es " + mi_nombre.charAt(0));
		
		int ultima_letra = mi_nombre.length();
		
		System.out.println(mi_nombre.charAt(ultima_letra-1));

	}

}
