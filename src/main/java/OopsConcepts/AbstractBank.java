package OopsConcepts;

public abstract class AbstractBank 
{
	//Partial Abstraction >> Hiding the Implementation/Business Logic is called Abstraction.
	//If a class is having at least one Abstract Method then that Class must be declared as abstract class.
	//We cannot achieve 100% Abstraction using Abstract Class.
	//Abstract Class can have both Abstract Methods and Concrete Methods.
	//We can have Static, Non-Static and Final Variables in Abstract Class.
	//Abstract class cannot be instantiated.
	//Abstract Class methods must be extended to Sub Class and Overridden.
	//We can create Constructor of Abstract Class.
	
	int amount = 100;
	final int rate = 200;
	static int loanAmount = 300;
	
	//Abstract Method <<A method without body or A method which is incomplete>>
	public abstract void loan(); 

	//Concrete Methods <<A method which has body>>
	public void debit()
	{
		System.out.println("Bank --- Debit Card");
	}
	
	public void credit()
	{
		System.out.println("Bank --- Credit Card");
	}
}





