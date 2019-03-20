import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseConstructionCostTest {

HouseConstructionCost hcc = new HouseConstructionCost();
	
	@Test
	void test() {
		assertEquals(132000.0, hcc.ConstructionCostCalc("standard_mat", 110.0, "no"));
		assertEquals(1395000.0, hcc.ConstructionCostCalc("above_standard_mat", 930.0, "no"));
		assertEquals(63000.0, hcc.ConstructionCostCalc("high_standard_mat", 35.0, "no"));
		assertEquals(375000.0, hcc.ConstructionCostCalc("high_standard_mat", 150.0, "yes"));
	}
}
