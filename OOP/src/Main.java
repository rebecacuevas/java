
public class Main {

	public static void main(String[] args) {
		
		Tacos firstTaco =  new Tacos("Masa Azul", "Suadero", 2, 30);
		
		/*
		firstTaco.tipoDeTortilla = "Masa Azul";
		firstTaco.tipoDeGuisado = "Suadero";
		firstTaco.numeroDeTortilla = 2;
		firstTaco.precio = 30;
		firstTaco.subirPrecio(5.5f);
		*/
		
		// Imprimir método
		System.out.println(firstTaco.toString());
		
		/*
		Tacos secondTaco = new Tacos();
		
		secondTaco.tipoDeTortilla = "Harina";
		secondTaco.tipoDeGuisado = "Bisteck";
		secondTaco.numeroDeTortilla = 1;
		secondTaco.precio = 42;
		
		System.out.println(secondTaco.toString());
		*/

	}

}
