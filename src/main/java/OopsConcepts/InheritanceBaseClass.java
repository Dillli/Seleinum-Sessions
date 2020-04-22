package OopsConcepts;

public class InheritanceBaseClass
{
	//Inheriting all the members of Parent Class to Child Class other than Private Members is called Inheritance.
	//Parent Class - Super Class.
	//Child Class - Sub-Ordinate Class.
	//Inheritance can be achieved by using Keyword Extends.
	//Multi-Level Inheritance is supported in Java.
	//Multiple Inheritance is not supported in Java through Classes but it can be achieved through Interfaces.
	
	//Constructor cannot be Inherited.
	//The Constructor of a Super Class can be invoked from the Sub Class.
	
	int i = 100;
	static int j = 200;
	private int k = 300; //It does not get inherited
	
	public void print()
	{
		System.out.println("I Value is ::: " +i);
	}
	
	public static void display()
	{
		System.out.println("J Value is ::: " +j);
	}
}
