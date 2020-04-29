package pdice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRoll() {
		Dice dice = new Dice(1);
		dice.Roll();
		assertTrue("range acceptable", dice.GetFaceValue() <= 6 && dice.GetFaceValue() > 0);	
	}
	
	@Test
	public void testGetFaceValue() {
		Dice dice = new Dice(1);
		assertEquals(1, dice.GetFaceValue());	
	}
	
	@Test
	public void testSetFaceValue() {
		Dice dice = new Dice(1);
		dice.SetFaceValue(5);
		assertEquals(5, dice.GetFaceValue());	
	}
	
	@Test
	public void testToString() {
		Dice dice = new Dice(1);
		assertEquals("dice roll was 1", dice.toString());	
	}
}
