package OopsConcepts;

public class InterfaceTestRunner 
{
	public static void main(String[] args)
	{
		InterfaceCarSwift Swift = new InterfaceCarSwift();
		Swift.start();
		Swift.stop();
		Swift.gear();
		Swift.theftSafety();
		
		//Dynamic Polymorphism <<Since We cannot Create an Object for Interface>>.
		//Here We are Creating Reference for Parent Class and Accessing Methods.
		InterfaceCarOld old = new InterfaceCarSwift();
		old.start();
		old.stop();
		old.gear();
	}
}
