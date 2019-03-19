package calculator;
/**
*
* This program finds addition multiplication
* and division of two numbers 
* @author Sahil Singla
*/
public class Calculator {
	/**
	 * finds addition of two numbers
	 * @return double data type addition of two numbers
	 */
	public double addition(double x , double y) {
		return x+y;
	}
	/**
	 * finds multiplication of two numbers
	 * @return double data type multiplication of two numbers
	 */
	public double multiplication(double x , double y) {	
            return x*y;
	}
	/**
	 * finds division of two numbers
	 * @return double data type x divides y division of two numbers
	 */
	public double division(double x, int y) {
		if(y==0)
			throw new ArithmeticException("Cannot divide by zero");
		else
			return x/y;
	}      
}
