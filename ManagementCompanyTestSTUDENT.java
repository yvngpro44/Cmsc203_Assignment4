import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	ManagementCompany m1;
	Property p1, p2, p3, p4, p5, p6;

	@Before
	public void setUp() throws Exception {
		//set up
		m1 = new ManagementCompany("House", "rockvile", 15);
		Property p1 = new Property("Big House", "gaithersburg", 5000, "rock", 1, 2, 2, 2);
		Property p2 = new Property("House", "gtown", 4300, "carrol", 8, 8, 2, 2);
		Property p3 = new Property("This place", "city 3", 3900, "pg", 4, 4, 2, 2);

		m1.addProperty(p1);
		m1.addProperty(p2);
		m1.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null
		m1 = null;
		p1 = p2 = p3 = p4 = p5 = p6 = null;

	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//student should add property with 4 args & default plot (0,0,1,1)
		p4 = new Property("home", "nyc", 4343, "chace");
		assertEquals(m1.addProperty(p4), 3, 0);
		
		//student should add property with 8 args
		p5 = new Property("apartment", "rockerson", 4510, "pg", 4, 6, 2, 2);
		assertEquals(m1.addProperty(p5), 4, 0);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		p6 = new Property("townhouse", "germanburg", 50205, "mont", 9, 9, 1, 1);
		assertEquals(m1.addProperty("town", "state", 700, "rob",9,6,1,1),-1);
	}
 
	@Test
	public void testMaxRentProp() {
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m1.maxRentProp(), 5000, 0);
		
	}

	@Test
	public void testTotalRent() {
		//student should test if totalRent returns the total rent of properties
		assertEquals(m1.totalRent(), 13200, 0);
	}

 }