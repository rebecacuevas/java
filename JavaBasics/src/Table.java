import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
		

		//1.- Crea una nueva clase llamada Tabla
		//2.- Copia el siguiente codigo y verifica que funcion
		
	    Scanner console = new Scanner(System.in);
	    int num;
	        
	    System.out.print("Ingresa cualquier número positivo: ");
	    num = console.nextInt();
	    System.out.println("Tabla de multiplicar de  " + num);
	        
	   //Implementa un bucle while que imprima el resultado
	   //3.- Debe imprimir la tabla de multiplicar del número en cuestión (solo los primeros 10 números)
	    
	  //while loop
	  int control = 0;
	  		
	  while(control < 10) {
		  control++;
		  int table = control * num;
		  System.out.println(table);	
	  	}
	}
}
