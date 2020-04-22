package OopsConcepts;

public class MethodOverridingBikeOld
{
	//Re-defining method of Sub Class which is already present in Super Class.
	//Method Overriding can be applied only and only for Non-Static Methods.
	//Rules:
	//There should be Inheritance or Is a relationship.
	//Method must be Non-Static.
	//Return type should also be same.
	//Method must have same name as in the Super Class with Same Signature and in same order.
	public void start()
	{
		System.out.println("Old Bike Start");
	}
	
	public void stop()
	{
		System.out.println("Old Bike Stop");
	}

	public void gear()
	{
		System.out.println("Old Bike gear");
	}
}
