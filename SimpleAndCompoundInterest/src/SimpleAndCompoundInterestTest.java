import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleAndCompoundInterestTest {

	@Test
	void testSimpleIntrest() {
		SimpleAndCompoundInterest simpleIntrest;
		simpleIntrest = new SimpleAndCompoundInterest(1512, 3f, 2);
		assertEquals(90.72000122070312, simpleIntrest.calcSimpleIntrest());
		simpleIntrest = new SimpleAndCompoundInterest(20202, 2.5f, 5);
		assertEquals(2525.25, simpleIntrest.calcSimpleIntrest());
	}
	
	@Test
	void testCompoundIntrest() {
		SimpleAndCompoundInterest compoundIntrest;
		compoundIntrest = new SimpleAndCompoundInterest(1512, 3f, 2);
		assertEquals(1604.0807108871472, compoundIntrest.calcCompoundIntrest());
		compoundIntrest = new SimpleAndCompoundInterest(20202, 2.5f, 5);
		assertEquals(22856.7060585414, compoundIntrest.calcCompoundIntrest());
	}

}
