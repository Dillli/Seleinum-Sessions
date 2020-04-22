package OopsConcepts;

public class MainMethodOverloading 
{
	//Yes, we can Overload Main Method in Java.
	public static void main(String[] args) 
	{
		System.out.println("A");
		main(10); //Direct Calling.
		MainMethodOverloading.main(10, 20); //Calling using its Class Name.
	}
	
	public static void main(int a) 
	{
		System.out.println("B");
		System.out.println(a);
	}
	
	public static void main(int a, int b) 
	{
		System.out.println("C");
		System.out.println(a+b);
	}
}
