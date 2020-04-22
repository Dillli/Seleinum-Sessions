package OopsConcepts;

public class AbstractHDFCBank extends AbstractBank
{
	@Override
	public void loan() 
	{
		System.out.println("HDFC Bank --- Loan");
	}
	
	//Below Method belongs only and only to AbstractHDFCBank Class
	public void funds()
	{
		System.out.println("HDFC Bank --- Funds");
	}
}