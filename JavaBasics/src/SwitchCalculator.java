import java.util.Scanner;

public class SwitchCalculator {
		
		public static void main(String[] args) {
			
			double numberOne, numberTwo, result;
			String operation;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("¿Qué operación deseas realizar?");
			operation = input.nextLine();
			
			System.out.println("Ingresa tu primer número");
			numberOne = input.nextDouble();
			
			System.out.println("Ingresa tu segundo número");
			numberTwo = input.nextDouble();
			
			switch(operation) {
			case "suma":
				result = numberOne + numberTwo;
				System.out.println(result);
				break;
			case "resta":
				result = numberTwo - numberOne;
				System.out.println(result);
				break;
			case "multiplicación":
				result = numberOne * numberTwo;
				System.out.println(result);
				break;
			case "división":
				result = numberTwo / numberOne;
				System.out.println(result);
				break;
			default:
				System.out.println("Esa operación no está disponible");
			}
	}
}
