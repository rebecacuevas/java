
import java.util.Scanner;

public class ControlFlowIf {
	
	public static void main(String[] args) {
		/*
		 *Estructuras de control de flujo
		 *Sirven para la toma de decisiones
		 *Sirven para cambiar el flujo de nuestro programa
		 *evaluando una condici�n y a partir de la evaluaci�n
		 *se realiza una acci�n u otra 
		 */
		
		/*
		 * if(condici�n) {
		 * c�digo
		 * } else {
		 * }
		 */
		
		System.out.println("Ingresa tu n�mero");
		Scanner input = new Scanner(System.in); 
		
		int age = input.nextInt();
		
		if(age >= 18 ) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
		
	}
}
