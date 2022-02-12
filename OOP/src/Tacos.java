
public class Tacos {
	
	// Definir atributos o caracter�sticas que tendr� nuestra clase 
	String tipoDeTortilla;
	String tipoDeGuisado;
	int numeroDeTortilla;
	float precio = 0.0f;
	
	// Crear constructor vac�o
	public Tacos() {
		
	}
	
	// Crear constructor con par�metro espec�fico
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	// Constructor 
	// Para inicializar objetos
	public Tacos(String tipoDeTortilla, 
			String tipoDeGuisado, 
			int numeroDeTortilla, 
			float precio) {
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.precio = precio;
	}
	
	// M�todos
	// Qu� acciones podemos hacer con los tacos
	
	void preparar() {
		System.out.println("Preparando tu taco");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que pica");
	}
	
	// Click derecho - Source - Generate to String() - Seleccionar todos los campos excepto el �ltimo
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", precio=" + precio + "]";
	}
	
	
}
