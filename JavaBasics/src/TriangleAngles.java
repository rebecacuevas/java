import java.util.Scanner;

public class TriangleAngles {
	
	public static void main(String[] args) {
		
		System.out.println("Ingresa el primer �ngulo");
		Scanner inputOne = new Scanner(System.in);
		int FirstAngle = inputOne.nextInt();
		
		System.out.println("Ingresa el segundo �ngulo");
		Scanner inputTwo = new Scanner(System.in);
		int SecondAngle = inputTwo.nextInt();
		
		System.out.println("Ingresa el tercer �ngulo");
		Scanner inputThree = new Scanner(System.in);
		int ThirdAngle = inputThree.nextInt();
		
		int sum = FirstAngle + SecondAngle + ThirdAngle;
		
		if(sum == 180) {
			System.out.println("Tu figura es un tri�ngulo");
		} else {
			System.out.println("Tu figura no es un tri�ngulo");
		}

	}
}