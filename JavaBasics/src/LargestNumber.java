import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Escribe tu primer número");
		Scanner inputOne = new Scanner(System.in);
		int FirstNumber = inputOne.nextInt();
		
		System.out.println("Escribe tu segundo número");
		Scanner inputTwo = new Scanner(System.in);
		int SecondNumber = inputTwo.nextInt();
		
		System.out.println("Escribe tu tercer número");
		Scanner inputThree = new Scanner(System.in);
		int ThirdNumber = inputThree.nextInt();

		if(FirstNumber > SecondNumber && FirstNumber > ThirdNumber) {
			System.out.println(FirstNumber + " es el número mayor");
		} else if(SecondNumber > FirstNumber && SecondNumber > ThirdNumber) {
			System.out.println(SecondNumber + " es el número mayor");
		} else {
			System.out.println(ThirdNumber + " es el número mayor");
		}
		
		/*
		System.out.println(FirstNumber);
		System.out.println(SecondNumber);
		System.out.println(ThirdNumber);
		*/
		
	}
}

