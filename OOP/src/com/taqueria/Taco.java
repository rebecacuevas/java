package com.taqueria;

public class Taco {
	
	// Definir atributos o características que tendrá nuestra clase 
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private float precio;
	
	// getters y setters
	public String getTortilla() {
		return this.tipoDeTortilla; 
	}
		
	public void setTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
		
	public String getGuisado() {
		return this.tipoDeGuisado;
	}
	
	public void setGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}
	
	public int getCuantasTortillas() {
		return this.numeroDeTortilla;
	}
	
	public void setCuantasTortillas(int numeroDeTortilla) {
		if(numeroDeTortilla >= 0 && numeroDeTortilla < 3) {
			this.numeroDeTortilla = numeroDeTortilla;
		}else {
			throw new IllegalArgumentException("No puedes pedir tantas tortillas");
		}
	}
	
	public float getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", precio=" + precio + "]";
	}

}
