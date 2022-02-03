//import java.util.HashSet;
//import java.util.TreeSet;
//import java.util.LinkedHashSet;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
		
		/*
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
			*/
				
		//TreeSet:
		//Ordena los elementos en función de sus valores
		/*
		Set<String> frutas = new TreeSet<String>();
			frutas.add("mango");
			frutas.add("granada");
			frutas.add("piña");
			frutas.add("sandia");
			frutas.add("mamey");
			frutas.add("fresa");
			
			for(String fruta : frutas) {
				System.out.println(fruta);
			}
			*/
				
		//LinkedeHashSet: 
		//Es la implementación más lenta
		//Ordena los elementos en orden de inserción 
		//Es más costoso que HashSet
		/*
		Set<String> frutas = new LinkedHashSet<String>();
			frutas.add("mango");
			frutas.add("granada");
			frutas.add("piña");
			frutas.add("sandia");
			frutas.add("mamey");
			frutas.add("fresa");
			
			for(String fruta : frutas) {
				System.out.println(fruta);
			}
			
			*/
			
			//Array List
			/*
			List<String> books = new ArrayList<String>();
			books.add("El señor de los anillos");
			books.add("Manhattan Transfer");
			books.add("Un tranvía llamado deseo");
			
			//add si agregamos un indice y un elemento, posiciona
			//el elemento en el indice y realiza un desplazamiento 
			books.add(2, "Por quien doblan las campanas");
			
			//remove remueve el elemento de la posición específicada 
			books.remove(0);
			
			//set reemplaza el elemento en la posición específicada 
			books.set(0, "El viejo y el mar");
			
			for(String book : books) {
				System.out.println(book);
			}
			
			System.out.println("----------------------");
			System.out.println(books.get(0));
			
			//indexOf, nos va a devolver la posición del elemento 
			//y si el elemento no se encuentra nos devuelve -1
			System.out.println(books.indexOf("El señor de los anillos"));
			*/
		
			//LinkedList
			//Es una lista doblemente enlazada
			/*
			List<String> postres = new LinkedList<String>();
			postres.add("pastel de chocolate");
			postres.add("helado");
			postres.add("churros");
			postres.add("dedos de novia");
			postres.add("flan napolitano");
			
			for(String postre : postres) {
				System.out.println(postre);
			}
			*/
			
			//Map
			//Asocia claves a valores
			//No puede contener claves duplicadas 
			//Solo puede tener un valor asociado
			
			//HashMap 
			//Tiene mejor rendimiento pero no garantiza un orden
			//a la hora de hacer iteraciones
			//No acepta claves duplicadas
			
			Map<Integer, String> users = new HashMap<Integer, String>();
			users.put(001, "Raúl de la Riva");
			users.put(002, "Karla Montoya");
			users.put(003, "Mario Rivera");
			
			//llave-valor
			System.out.println(users.get(001));
			
			//keySet
			//Nos permite recuperar el nombre de la clave
			//Nos permite recuperar el valor directamente
			
			System.out.println(users.keySet());
			System.out.println(users.values());
			
			//TreeMap
			Map<String, String> startups = new TreeMap<String, String>();
			startups.put("NuBank", "David Vélez");
			startups.put("Bitso", "Daniel Veguel");
			startups.put("Hotmart", "João Pedro Resende");
			
			System.out.println(startups. keySet());
			System.out.println(startups.values());
			
			//mismo resultado que el forEach elemento
			System.out.println(startups);
			
			//función lambda
			//imprime clave-valor 
			startups.entrySet().forEach(clave -> {
				System.out.println(clave.getKey().toString() + " " + clave.getValue().toString());
			});
			
			//imprime claves y valores con un signo de asignación 
			startups.entrySet().forEach(elemento -> {
				System.out.println(elemento);
			});
			
			//LinkedHashMap
			Map<Integer, String> happiestCountry = new LinkedHashMap<Integer, String>();
			happiestCountry.put(1, "Finland");
			happiestCountry.put(2, "Iceland");
			happiestCountry.put(3, "Denmark");
			happiestCountry.put(4,"Switzerland");
			happiestCountry.put(5, "Netherlands");
			
			System.out.println(happiestCountry.keySet());
			System.out.println(happiestCountry.values());

	}

}
