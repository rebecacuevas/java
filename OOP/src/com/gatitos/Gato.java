package com.gatitos;

public class Gato {
	
	// Atributos 
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	// Constructor
	/*
	public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	*/
	
	// getters y setters
	// deben ser public 
	public String getNombre() {
		return this.nombre; 
	}
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		if(patas >= 0 && patas < 5) {
			this.patas = patas;			
		}else {
			throw new IllegalArgumentException("El número de patas no es válido");
		}
		
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}
	
}
