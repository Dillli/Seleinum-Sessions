package OopsConcepts;

public class ConstructorOverloading_2 
{
	public static void main(String[] args)
	{
		ConstructorOverloading_1 overload1 = new ConstructorOverloading_1(30,20);
		System.out.println(overload1.i);
		System.out.println(overload1.j);
		
		System.out.println("**********");
		
		ConstructorOverloading_1 overload2 = new ConstructorOverloading_1("Java", "Selenium");
		System.out.println(overload2.a);
		System.out.println(overload2.b);
		
		System.out.println("**********");
		
		ConstructorOverloading_1 overload3 = new ConstructorOverloading_1(25, "Python");
		System.out.println(overload3.i);
		System.out.println(overload3.a);
	}
}
