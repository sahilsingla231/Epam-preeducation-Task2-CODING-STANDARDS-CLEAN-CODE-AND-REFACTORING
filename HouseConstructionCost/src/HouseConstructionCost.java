
public class HouseConstructionCost {
	/**
	 * This method calculates Construction cost based on various material quality
	 * @param materialQuality, represents quality of material
	 * @param area, represents area in square feet
	 * @param fullyAutomated, represents home should be fully automated or not
	 * @return cost of construction in INR
	 */
	public double ConstructionCostCalc(String materialQuality, double area, String fullyAutomated) {

		if(materialQuality.equals("standard_mat")) {
			return 1200*area;
		}
		
		else if( materialQuality.equals("above_standard_mat")) {
			return 1500*area;
		}
		
		else if(materialQuality.equals("high_standard_mat") && fullyAutomated.equals("yes")){
			return 2500*area;
		}
		
		else {
			return 1800*area;
		}
	}
	
}
