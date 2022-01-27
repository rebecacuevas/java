package operators;

public class operators {
	public static void main(String[] args) {
		
		// arithmetic operators
		// +, -, *, /, %
		int a = 10;
		int b = 20;
		
		// sum
		int sum = a + b;
		System.out.println(sum);
		
		String firstString = "El resultado es: ";
		System.out.println(firstString + sum);
		
		// subtraction
		System.out.println("El resultado de la resta es: " + (b - a));
		
		// division 
		int division = b / a;
		System.out.println("El resultado de la división es: " + division);
		
		// to obtain decimals we need to turn the data types into double 
		double division02 = (double) a / b;
		System.out.println("El resultado de la división es " + division02);
		
		// multiplication
		double mult = a * b;
		System.out.println("El resultado de la multiplicación es " + mult);
		
		// módulo 
		double module = b % a;
		System.out.println("El residuo de la división es: " + module);
		
		
		// Operador de asignación 
		
		int d = 5, e; // create empty variables 
		e = 10;
		
		System.out.println(d + " - " + e);
		
		
		// Operadores de declaración compuesta
		// +=, -=, *=, /=, %=
		
		int f = 0, g = 5;
		
		f += 5;
		System.out.println(f);
		
		// Operadores relacionales
		// <, >, <=, >=, ==, !=
		
		// Boolean type outcome
		int h = 15, i = 25;
		String j = "Olá";
		System.out.println(h > i); //false
		System.out.println(i != h); //true 
		
		// Operador unario
		// ++, --
		//preasignación -- ++k se le asigna un valor antes de usarse
		//postasignación k++ -- primero lee el valor y despues le suma 1
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		// Precedencia de operadores 
		
		int op = 4 + 5 + 6 / 3;
		System.out.println(op);
		
		int x = 0, y = 0;
		int opTwo = ++x + y--;
		System.out.println(opTwo);
		
		//Operador ternario 
		int age = 19, value01 = 0;
		
		int outcome = (age <= 18) ? (value01 = 2) : (value01 = 3);
		
		/*
		int age = 18;
		
		int value = (age <= 18) ? 2:1;
		*/
		
		System.out.println(outcome);
		
		// Operadores lógicos
		// and &&
		// or ||
		// ! invierte el estado lógico 
		
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false || true); //true
		System.out.println(false || false); //false 
		System.out.println(true && !false); //true
	}
}
