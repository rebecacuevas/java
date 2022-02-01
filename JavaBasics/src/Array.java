
public class Array {
	
	public static void main(String[] args) {
		
		/*
		 Arreglos
		 Solo un tipo de dato
		 Especificar el tamaño o la cantidad de elementos que va a contener
		 */
		
		//Método uno 
		int numbers[]; //creamos la variable
		numbers = new int[4]; //crear el arreglo 
		
		//almacenar datos dentro del arreglo 
		numbers[0] = 1890;
		numbers[1] = 1920;
		numbers[2] = 1950;
		numbers[3] = 1990;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//Método dos
		String[] cities = new String[5];
		
		cities[0] = "Amsterdam";
		cities[1] = "Sao Paulo";
		cities[2] = "San Francisco";
		cities[3] = "San Petersburgo";
		cities[4] = "Monterrey";
		
		for(int i = 0; i < cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		//Método tres
		//Array literal 
		String []langs = new String[]{"Turkish, English, Brazilian Portuguese, Mandarin Chinese, Spanish"}; 
		
		for(int i = 0; i < langs.length; i++) {
			System.out.println(langs[i]);
		}
		
	}
}
