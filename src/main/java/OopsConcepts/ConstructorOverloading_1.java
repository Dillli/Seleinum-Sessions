package OopsConcepts;

public class ConstructorOverloading_1
{
	//When we have more than one constructor for a same class with different signature.
	//Different signature means:
	//<<Number of arguments should be different>>
	//<Type of arguments should be different>>
	//<Sequence of arguments should be different>>
	
	int i,j;
	String a,b;
	
	ConstructorOverloading_1(int u, int v)
	{
		i=u;
		j=v;
	}
	
	ConstructorOverloading_1(String x, String y)
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading_1(int p, String s)
	{
		i=p;
		a=s;
	}
}
