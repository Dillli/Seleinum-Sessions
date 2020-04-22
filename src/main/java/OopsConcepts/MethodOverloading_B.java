package OopsConcepts;

public class MethodOverloading_B extends MethodOverloading_A
{
	public static void Hide()
	{
		System.out.println("It is a Static Method with No Argument in MethodOverloading_B");
	}
	
	public static void main(String[] args) 
	{
		//Calling Static Method using Class Name.
		MethodOverloading_B.Hide(5);
		
		System.out.println("****************************");
		
		//Creating an Object to call Non-Static Methods.
		MethodOverloading_B overload = new MethodOverloading_B(); 
		overload.Show();
		overload.Show(5, 10);
		overload.Show("Java", "Selenium");
		overload.Hide();
		
		System.out.println("****************************");
		
		//Calling Static Overridden Method using Class Name.
		MethodOverloading_B.Hide(); 
	}
}
