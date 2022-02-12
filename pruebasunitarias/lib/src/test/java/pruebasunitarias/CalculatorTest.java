package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	private final Calculator calculator02 = new Calculator();
	private final Calculator calculator03 = new Calculator();
	private final Calculator calculator04 = new Calculator();

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	
	@Test
	void subtraction() {
		assertEquals(1, calculator02.subtractNumbers(2, 1));
	}
	
	@Test
	void multiplication() {
		assertEquals(25, calculator03.multiplyNumbers(5, 5));
	}
	
	@Test
	void division() {
		assertEquals(50, calculator04.divideNumbers(100, 2));
	}

}
