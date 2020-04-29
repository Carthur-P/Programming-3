package pbankaccount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAccount() {
		BankAccount myAccount = new BankAccount(); 
		assertEquals(0, myAccount.getAccount(),0.00001); //testing to see if the account is 0
	}

	@Test
	public void testDeposit() {
		BankAccount myAccount = new BankAccount(); 
		myAccount.deposit(50);
		assertEquals(50, myAccount.getAccount(),0.00001); //testing to see if the account is 50
	}

	@Test
	public void testWithdraw() {
		BankAccount myAccount = new BankAccount(); 
		myAccount.deposit(50);//depositing $50
		myAccount.withdraw(25);//withdrawing $25
		assertEquals(25, myAccount.getAccount(),0.00001); //testing to see if the account is 25
	}
	
	@Test
	public void withdrawWithPenalty()
	{
		BankAccount myAccount = new BankAccount(); 
		myAccount.deposit(50);//depositing $50
		myAccount.withdraw(55);//withdrawing $25
		assertEquals(-10, myAccount.getAccount(),0.00001); //testing to see if the account is -10
	}

	@Test
	public void testAddInterest() {
		BankAccount myAccount = new BankAccount(); 
		myAccount.deposit(1000);//depositing $50
		myAccount.addInterest();
		assertEquals(1033.50, myAccount.getAccount(),0.00001); //testing to see if the account is -10
	}
}
