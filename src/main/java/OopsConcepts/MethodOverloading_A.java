package OopsConcepts;

public class MethodOverloading_A
{
	//Creating or Developing multiple methods with same method name but different signature.
	//Different signature means:
	//<<Number of arguments should be different>>
	//<Type of arguments should be different>>
	//<Sequence of arguments should be different>>
	//Method Overloading can be applied for both Static and Non-Static Methods.
	//Method can be overloaded in same class or in sub class.
	
	public void Show()
	{
		System.out.println("Non-Static Method with No Arguments");
	}
	
	public int Show(int a, int b)
	{
		int c;
		c = a+b;
		System.out.println("Non-Static Method with 2 Int Arguments ::: " +c);
		return c;
	}
	
	public String Show(String a, String b)
	{
		String c;
		c = a+b;
		System.out.println("Non-Static Method with 2 String Arguments ::: " +c);
		return c;
	}
	
	public static void Hide()
	{
		System.out.println("Static Method with No Arguments in MethodOverloading_A");
	}
	
	public static void Hide(int a)
	{
		System.out.println("Static Method with 1 Int Arguments");
	}
}
