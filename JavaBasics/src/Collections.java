import java.util.HashSet;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos 
		// La diferencia de las colecciones y los objetos 
		//Es que las colecciones y los objetos
		// es que las olecciones sondinamicas, pueden cambiar
		// el numero de los objetoa garegados
		
		
		// Set tiene 3 implementaciones 
		//No puede contener elementos repetidos
		
		//HashSet:
		//Los elementos no mantienen un orden
		//es la implementación más rápida 
		
		Set<String> frutas = new HashSet<String>();
				frutas.add("mango");
				frutas.add("granada");
				frutas.add("piña");
				frutas.add("sandia");
				frutas.add("mamey");
				frutas.add("fresa");
				
				//foreach puede recorrer una colección y en cada recorrido
				//recupera el valor y lo podemos almacenar en una variable
				//Sintaxis
				// for(tipoDeDatoElemento variable : elementoARecorrer)
				for(String fruta : frutas) {
					System.out.println(fruta);
				}
				
		//TreeSet: 
		//LinkedeHashSet: 
	}

}
