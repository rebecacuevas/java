
import java.util.Scanner;

public class PrintName {
	
	public static void main(String[] args) {
		
		System.out.println("¿Cómo te llamas?");
		Scanner input = new Scanner(System.in);
		String yourName = input.nextLine();
		
		for(int i = 0; i < yourName.length(); i++) {
			System.out.println(yourName.charAt(i));
		}
		
	}
}
