
import java.util.Scanner;

public class ControlFlowIf {
	
	public static void main(String[] args) {
		/*
		 *Estructuras de control de flujo
		 *Sirven para la toma de decisiones
		 *Sirven para cambiar el flujo de nuestro programa
		 *evaluando una condición y a partir de la evaluación
		 *se realiza una acción u otra 
		 */
		
		/*
		 * if(condición) {
		 * código
		 * } else {
		 * }
		 */
		
		System.out.println("Ingresa tu número");
		Scanner input = new Scanner(System.in); 
		
		int age = input.nextInt();
		
		if(age >= 18 ) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("No eres mayor de edad");
		}
		
	}
}
