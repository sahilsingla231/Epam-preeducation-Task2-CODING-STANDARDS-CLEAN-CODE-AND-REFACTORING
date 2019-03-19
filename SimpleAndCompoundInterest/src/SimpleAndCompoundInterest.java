/**
*
* This program finds simple interest and compound interest
* @author Sahil Singla
*/
public class SimpleAndCompoundInterest {
	
	float principle,rateOfIntrest,timePeriod;
	/**
	 * constructor initializes class data 
	 * @author Sahil Singla	
	 */
	public SimpleAndCompoundInterest(float principle,float rateOfIntrest,float timePeriod) {
		this.principle=principle;
		this.rateOfIntrest=rateOfIntrest;
		this.timePeriod=timePeriod;
	}
	/**
	 * finds simple interest of existing class data instance
	 * @return double simple interest
	 */
	public double calcSimpleIntrest() {
		return (principle*timePeriod*rateOfIntrest)/100;
	}
	/**
	 * finds compound interest of existing class data instance
	 * @return double compound interest
	 */
	public double calcCompoundIntrest() {
		return principle * 
                (Math.pow((1 + rateOfIntrest / 100), timePeriod));
	}

}
