package methods;

public class Method {
	
	//Hay una solo paquete que esta especialiazdo para el metodo main
	
	// Metodo es una funcion 
	
		//Atributos de la clase
		int a, b;
		
		//Metodo void (Vacio)
		public void sumar() {
			int resultado = a +b;
			System.out.println("El resultado de sumar " + a + " mas " + b + " es " + resultado);
		}
		
		//metodo con retorno de valores
		public int sumaConRetorno() {
			//int result = a + b;
			//return result;
			return a + b;
		}
		
		//argumentos
		//suma(argumentos)
		public double multiplicarConArgumentos(int arg1, double arg2) {
			int c = arg1;
			double d = arg2;
			return c * d;
			
		}
		
		//metodo estático 
		//estático, void[no regresa nada], usa argumentos
		public static void imprimirNombre(String nombre) {
			System.out.println("Mi nombre es " + nombre);
		}
}
