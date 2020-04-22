package OopsConcepts;

public class AbstractTestRunner
{
	public static void main(String[] args)
	{
		AbstractHDFCBank HDFCBank = new AbstractHDFCBank();
		HDFCBank.loan();
		HDFCBank.debit();
		HDFCBank.credit();
		HDFCBank.funds();
		
		//Dynamic Polymorphism <<Since We cannot Create an Object for Abstract Class>>.
		//Here We are Creating Reference for Parent Class and Accessing Methods.
		AbstractBank Bank = new AbstractHDFCBank();
		Bank.loan();
		Bank.debit();
		Bank.credit();
	}
}
