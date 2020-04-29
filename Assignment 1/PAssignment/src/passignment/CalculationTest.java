package passignment;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testFindMax() {
		ArrayList<Plane> planeList = new ArrayList<Plane>();
		ArrayList<Accident> accidentList = new ArrayList<Accident>();
		ReadFile.Load(planeList, accidentList);
		assertEquals(583, Calculation.findMax(accidentList, Fields.AIRFATALITY));
	}

	@Test
	void testFindMin() {
		ArrayList<Plane> planeList = new ArrayList<Plane>();
		ArrayList<Accident> accidentList = new ArrayList<Accident>();
		ReadFile.Load(planeList, accidentList);
		assertEquals(1, Calculation.findMin(accidentList, Fields.AIRFATALITY));
	}

	@Test
	void testFindTotal() {
		ArrayList<Plane> planeList = new ArrayList<Plane>();
		ArrayList<Accident> accidentList = new ArrayList<Accident>();
		ReadFile.Load(planeList, accidentList);
		assertEquals(104971, Calculation.findTotal(accidentList, Fields.AIRFATALITY));
	}

	@Test
	void testFindAverage() {
		ArrayList<Plane> planeList = new ArrayList<Plane>();
		ArrayList<Accident> accidentList = new ArrayList<Accident>();
		ReadFile.Load(planeList, accidentList);
		assertEquals(20.078615149196633, Calculation.findAverage(accidentList, Fields.AIRFATALITY));
	}
}
