 package OopsConcepts;

public class Encapsulation 

{
	//To hide Variables and Methods we use Encapsulation. [Can also be called as Data Hiding].
	//So that no one can access these Private Members directly from outside of the Class.
	//Encapsulation is a packing of data and functions into a single component and hiding internal implementation.
	//It can be achieved by hiding data by making variables private and showing functionalities through getter and setter Methods.
	
	private int ssn;
	private String empName;
	private int empAge;
	
	public static void main(String[] args)
	{
		Encapsulation en = new Encapsulation();
		en.setSsn(14233);
		en.setEmpName("Tom Peter");
		en.setEmpAge(25);
		
		System.out.println("Employee SSN Number is ::: " +en.getSsn());
		System.out.println("Employee Name is ::: " +en.empName);
		System.out.println("Employee Age is ::: " +en.empAge);
	}
	
	//Getter and Setter Methods to Access Private Members.
	//Getter and Setter Methods are Public in nature.
	//To Set and Get Values of the Fields we use Getter and Setter Methods.
	//First We need to Set the Value and then Get the Value.
	//For Every Class Variable, we need to create one Set() and Get().
	
	public int getSsn() 
	{
		return ssn;
	}

	public void setSsn(int ssn) 
	{
		this.ssn = ssn;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	}

	public int getEmpAge() 
	{
		return empAge;
	}

	public void setEmpAge(int empAge)
	{
		this.empAge = empAge;
	}
}
