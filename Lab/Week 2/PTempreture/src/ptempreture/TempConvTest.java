package ptempreture;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TempConvTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetCel() {
		TempConv converter = new TempConv(20);
		assertEquals(20, converter.getCel(),0.00001);
	}

	@Test
	public void testSetFal() {
		TempConv converter = new TempConv(20);
		converter.setFah(0);
		assertEquals(-17.77778, converter.getCel(),0.00001);
		assertEquals(255.37222, converter.getKel(),0.00001);
	}

	@Test
	public void testSetKel() {
		TempConv converter = new TempConv(20);
		converter.setKel(456);
		assertEquals(182.85, converter.getCel(),0.00001);
		assertEquals(361.13, converter.getFah(),0.00001);
	}

	@Test
	public void testToString() {
		TempConv converter = new TempConv(20);
		assertEquals("celsius = 20.00 fahrenheit = 68.00 kelvin = 293.15", converter.toString());
	}

	@Test
	public void testGetCelsius()
	{
		TempConv temp = new TempConv(20);
		assertEquals(20, temp.getCel(), 0.001);
		 temp = new TempConv(90);
		assertEquals(194, temp.getFah(), 0.001);
		 temp = new TempConv(12);
		assertEquals(285.15, temp.getKel(), 0.001);
		 temp = new TempConv(20);
		temp.setCel(50);
		assertEquals(50, temp.getCel(), 0.001);
		 temp = new TempConv(5);
		temp.setFah(67);
		assertEquals(19.44444444444443, temp.getCel(), 0.001);
		 temp = new TempConv(7);
		temp.setKel(50.5);
		assertEquals(50.5, temp.getKel(), 0.001);
		 temp = new TempConv(7);
		assertEquals("celsius = 7.00 fahrenheit = 44.60 kelvin = 280.15", temp.toString());	
	}
}
