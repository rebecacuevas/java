import java.util.Scanner;

public class ShoppingDiscounts {
	
	public static void main(String[] args) {
		
		double OriginalPrice, discount, YourTotal;
		
		System.out.println("¿Cuál fue el total de tu ticket?");
		Scanner total = new Scanner(System.in);
		OriginalPrice = total.nextDouble();
		
		// si la cuenta es menor a $1000, no hay descuento
		// si la cuenta es de $1000 a $4999, hay un descuento del 10%
		// si la cuenta es de $5000 a $9999, hay un descuento del 20%
		// si la cuenta es igual o mayor de $10000, hay un descuento del 30%
		
		if(OriginalPrice < 1000) {
			YourTotal = OriginalPrice;
			System.out.println("Solo ofrecemos descuentos en compras mayores a $1000. Tu total a pagar es " + YourTotal);
		} else if(OriginalPrice >= 1000 && OriginalPrice <= 4999) {
			YourTotal = OriginalPrice * 0.9; 
			System.out.println("Tienes un descuento de 10%, tu total a pagar es " + YourTotal);
		} else if(OriginalPrice >= 5000 && OriginalPrice <= 9999) {
			YourTotal = OriginalPrice * 0.8;
			System.out.println("Tienes un descuento de 20%, tu total a pagar es " + YourTotal);
		} else if(OriginalPrice >= 10000) {
			YourTotal = OriginalPrice * 0.7;
			System.out.println("Tienes un descuento de 30%, tu total a pagar es " + YourTotal);
		} else {
			System.out.println("Ingresa un total de compra válido");
		}
	}
}