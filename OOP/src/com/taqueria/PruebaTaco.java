package com.taqueria;

public class PruebaTaco {
	
	public static void main(String[] args) {
		
		Taco miTaco = new Taco();
		
		miTaco.setTortilla("Masa azul");
		miTaco.setGuisado("Arrachera");
		miTaco.setCuantasTortillas(3);
		miTaco.setPrecio(30);
		
		System.out.println(miTaco);
	}
	
}
