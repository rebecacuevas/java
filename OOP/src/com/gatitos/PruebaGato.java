package com.gatitos;

public class PruebaGato {
	
	public static void main(String[] args) {
		
		//Gato gatito = new Gato("Gatito", 4, true);
		Gato gatito = new Gato();
		
		
		//gatito.nombre = "Gatito";
		//gatito.patas = 3;
		
		
		gatito.setNombre("Gatito");
		gatito.setPatas(3);
		gatito.setAdoptado(true);
		
		System.out.println(gatito);
		
	}
	
}
