
public class Loops {
	public static void main(String[] args) {
		
		//while loop
		/*
		int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);	
			control++;
		}
		*/
		
		//do-while
		/*
		int control = 0;
		do {
			//c�digo a ejecutar
			System.out.println("Control  = " + control);
			//modificador de la variable de control
			control++;
		} while(control < 3);
		*/
		
		//for
		/*
		for(int i = 0; i < 3, i++) {
			System.out.println("Control =" + i);
		}
		*/
		
		//break
		/*
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("Control = " + i);
				break; //modifica el funcionamiento del for
				//termina el ciclo, solo se ejecutar� una vez
			}
		}
		*/
		
		//continue
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue; //permite saltarnos una ejecuci�n del ciclo 
				//deja que continue el ciclo 
			}
			System.out.println("Control = " + i); 
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("Control 2 = " + i);
			continue;
		}
	}
}
