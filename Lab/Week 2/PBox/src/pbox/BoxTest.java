package pbox;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetHeight() {
		Box normalBox = new Box(80);
		assertEquals(80, normalBox.getHeight(), 0.001);
	}

	@Test
	public void testGetWidth() {
		Box normalBox = new Box(80);
		assertEquals(80, normalBox.getWidth(), 0.001);
	}

	@Test
	public void testGetLength() {
		Box normalBox = new Box(80);
		assertEquals(80, normalBox.getLength(), 0.001);
	}

	@Test
	public void testSetHeight() {
		Box normalBox = new Box(80);
		normalBox.setHeight(200);
		assertEquals(200, normalBox.getHeight(), 0.001);
	}

	@Test
	public void testSetWidth() {
		Box normalBox = new Box(80);
		normalBox.setWidth(150);
		assertEquals(150, normalBox.getWidth(), 0.001);
	}

	@Test
	public void testSetLength() {
		Box normalBox = new Box(80);
		normalBox.setLength(50);
		assertEquals(50, normalBox.getLength(), 0.001);
	}

	@Test
	public void testToString() {
		Box normalBox = new Box(80);
		assertEquals("Height = 80.0 Width = 80.0 Length = 80.0", normalBox.toString());
	}
}
