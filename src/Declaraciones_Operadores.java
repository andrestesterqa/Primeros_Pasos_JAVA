
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		
		int a = 5; //Declaración de variable inicializada con un valor
		int b; // Declararación de variable sin valor
		
		b = 7; //Inicialización de variable anteriormente declarada
		
		int c = b+a; /*Declaración de variable inicializada con el valor
		 			de las variables anteriores*/
		
		c++;
		c+=5;
		System.out.println("Resultado 1° ejercicio");
		System.out.println(c);
		
//---------------------------------------------------------------		
		final double apulgadas = 2.54;
		
		double cm = 6;
		
		double resultado = cm/apulgadas;
		
		System.out.println("Resultado 2° ejercicio");
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
//---------------------------------------------------------------		

		int operador1, operador2, resultadoFinal; // Declarar multiples variables del mismo tipo en una línea
		operador1 = 8;
		operador2 = 7;
		resultadoFinal = operador1 + operador2;
		
		System.out.println("Resultado 3° ejercicio");
		
		System.out.println(resultadoFinal);
		
//---------------------------------------------------------------
		int var1 = 10;
		
		System.out.print(Math.sqrt(var1));
		
	}

}
