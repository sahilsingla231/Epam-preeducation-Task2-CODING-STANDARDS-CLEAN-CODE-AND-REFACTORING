package calculator;
/**
 *
 * @author Sahil Singla
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest1 {

	Calculator c = new Calculator();
	@Test
	public void testAddition() {
		assertEquals(6, c.addition(2,4));
		assertEquals(-11, c.addition(-8,-3));
		assertEquals(21, c.addition(20,1));
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(8, c.multiplication(2,4));
		assertEquals(-8, c.multiplication(2,-4));
		assertEquals(-8, c.multiplication(-2,4));
		assertEquals(8, c.multiplication(-2,-4));
	}
	
	@Test
	public void testDivision() {
		assertEquals(2, c.division(4,2));
		assertEquals(-2, c.division(4,-2));
		assertEquals(-2, c.division(-4,2));
		assertEquals(2, c.division(-4,-2));
		Assertions.assertThrows(ArithmeticException.class, () -> c.division(6, 0));
	}
		
}
