import java.util.Scanner;

public class ControlFlowSwitch {
	
	public static void main(String[] args) {
		// Estructuras de control nos sirven para controlar el
		// flujo de comportamiento de un programa as� como para la
		// toma de decisiones
		
		/* 
		 * switch(condici�n) {
		 * 	case "valor":
		 * 		c�digo a ejecutar
		 * 		break;
		 * 	case "n":
		 * 		c�digo a ejecutar
		 * 		break;
		 * 	default:
		 * 		c�digo a ejecutar
		 * }
		 */
		
		// Solicitar al usuario un d�a de la semana
		// Mostrarle un mensaje
		
		System.out.println("�Qu� d�a de la semana es hoy?");
		Scanner day = new Scanner(System.in);
		String whichDayIsIt = day.nextLine();
		
		switch(whichDayIsIt.toLowerCase()) {
			case "lunes":
				System.out.println("Begin at once to live, and count each separate day as a separate life.");
				break;
			case "martes":
				System.out.println("There is no better way to grow as a person than to do something you hate every day.");
				break;
			case "mi�rcoles":
				System.out.println("But to recognize that if it�s humanly possible, you can do it too.");
				break;
			case "jueves":
				System.out.println("Your perspective on life comes from the cage you were held captive in.");
				break;
			case "viernes":
				System.out.println("Be tolerant with others and strict with yourself");
				break;
			case "s�bado":
				System.out.println("It�s not that we have little time, but more that we waste a good deal of it.");
				break;
			case "domingo":
				System.out.println("If a man knows not which port he sails, no wind is favorable.");
				break;
			default:
				System.out.println("That's not a day of the week");
		}
		
	}
}
