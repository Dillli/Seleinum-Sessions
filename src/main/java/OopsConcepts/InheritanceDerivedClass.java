package OopsConcepts;

public class InheritanceDerivedClass extends InheritanceBaseClass
{
	public static void main(String[] args)
	{
		InheritanceDerivedClass derivedClass= new InheritanceDerivedClass();
		derivedClass.print();
		
		System.out.println(derivedClass.i);
		
		System.out.println("****************************");
		
		InheritanceDerivedClass.display();
		System.out.println(InheritanceDerivedClass.j);
		
//		System.out.println(derivedClass.k); //Private Members Cannot be Inherited
		
		//Static Members can be accessed through a Class Name
		//Non-Static Members cannot be accessed through a Class Name
		//Non-Static Members can be accessed by creating an Object of it's Class.
	}
}
