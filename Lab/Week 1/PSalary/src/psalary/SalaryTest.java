package psalary;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaryTest {
	
	@Test
	public void testGetGross() {
		Salary mySalary = new Salary(1000);
		assertEquals(1000, mySalary.getGross(),0.00001);
	}

	@Test
	public void testSetGross() {
		Salary mySalary = new Salary(1000);
		mySalary.setGross(1000);
		assertEquals(1000, mySalary.getGross(),0.00001);
	}

	@Test
	public void testGetTax1() {
		Salary mySalary = new Salary(100000);
		assertEquals(23920, mySalary.getTax(),0.00001);
	}
	
	@Test
	public void testGetTax2() {
		Salary mySalary = new Salary(50000);
		assertEquals(8020, mySalary.getTax(),0.00001);
	}
	
	@Test
	public void testGetTax3() {
		Salary mySalary = new Salary(20000);
		assertEquals(2520, mySalary.getTax(),0.00001);
	}

	@Test
	public void testGetTax4() {
		Salary mySalary = new Salary(5000);
		assertEquals(525, mySalary.getTax(),0.00001);
	}
	
	@Test
	public void testGetTax5() {
		Salary mySalary = new Salary(0);
		assertEquals(0, mySalary.getTax(),0.00001);
	}
	
	@Test
	public void testGetNet() {
		Salary mySalary = new Salary(100000);
		assertEquals(76080, mySalary.getNet(),0.00001);
	}
	
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }


}
