import java.util.Scanner;

public class TriangleAngles {
	
	public static void main(String[] args) {
		
		System.out.println("Ingresa el primer ángulo");
		Scanner inputOne = new Scanner(System.in);
		int FirstAngle = inputOne.nextInt();
		
		System.out.println("Ingresa el segundo ángulo");
		Scanner inputTwo = new Scanner(System.in);
		int SecondAngle = inputTwo.nextInt();
		
		System.out.println("Ingresa el tercer ángulo");
		Scanner inputThree = new Scanner(System.in);
		int ThirdAngle = inputThree.nextInt();
		
		int sum = FirstAngle + SecondAngle + ThirdAngle;
		
		if(sum == 180) {
			System.out.println("Tu figura es un triángulo");
		} else {
			System.out.println("Tu figura no es un triángulo");
		}

	}
}