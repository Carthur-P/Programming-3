package pbankaccount;

public class BankAccount {
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public double getAccount()
	{
		return balance;
	}
	
	public void deposit(double deposit)
	{
		balance += deposit;
	}
	
	public void withdraw(double withdraw)
	{
		balance -= withdraw; 
		if (balance < 0)
		{
			balance -= 5;
		}
	}
	
	public void addInterest()
	{
		if (balance > 0 )
		{
			double initialInterest = balance*(0.05);
			double tax = initialInterest*(0.33);
			double interest = initialInterest - tax;
			balance += interest;
		}		
	}
}
