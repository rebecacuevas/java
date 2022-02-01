import java.util.Scanner;

public class ScannerBuffer {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int firstNumber = input.nextInt();
		input.nextLine();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = input.nextLine();
		input.close();
		
		System.out.println("Tu nombre es: " + nombre + "\nTu número: " + firstNumber);
	}
}
