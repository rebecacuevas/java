import java.util.Scanner;

public class SwitchCalculator {
		
		public static void main(String[] args) {
			
			double numberOne, numberTwo, result;
			String operation;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("�Qu� operaci�n deseas realizar?");
			operation = input.nextLine();
			
			System.out.println("Ingresa tu primer n�mero");
			numberOne = input.nextDouble();
			
			System.out.println("Ingresa tu segundo n�mero");
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
			case "multiplicaci�n":
				result = numberOne * numberTwo;
				System.out.println(result);
				break;
			case "divisi�n":
				result = numberTwo / numberOne;
				System.out.println(result);
				break;
			default:
				System.out.println("Esa operaci�n no est� disponible");
			}
	}
}
