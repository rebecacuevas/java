
public class ManipulateArray {
	
	public static void main(String[] args) {
		
		//crea un array con los siguientes números enteros:
		//1, 6, 45, 53, 80, 102, 145, 326, 450, 892
		//Crea un programa que use un ciclo que tome los números de arreglo 
		//devuelva la suma total
		//la suma de los números pares
		//la suma de los números impares.
		
		int numbers[];
		numbers = new int[10];
		int sum = 0;
		int sumEven = 0;
		int sumUneven = 0;
	
		numbers[0] = 1;
		numbers[1] = 6;
		numbers[2] = 45;
		numbers[3] = 53;
		numbers[4] = 80;
		numbers[5] = 102;
		numbers[6] = 145;
		numbers[7] = 326;
		numbers[8] = 450;
		numbers[9] = 892;
		
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}

		System.out.println("La suma de los números es: " + sum);
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 == 0) {
				sumEven = sumEven + numbers[i];
				System.out.println("Los números pares son: " + numbers[i]);
			}
			
		}
		
		System.out.println("La suma de los números pares es: " + sumEven);
		
		System.out.println("---------------------------");
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] % 2 != 0) {
				sumUneven = sumUneven + numbers[i];
				System.out.println("Los números primos son: " + numbers[i]);
			}
		}
		
		System.out.println("La suma de los números pares es: " + sumUneven);
		
		System.out.println("---------------------------");

	}

}
