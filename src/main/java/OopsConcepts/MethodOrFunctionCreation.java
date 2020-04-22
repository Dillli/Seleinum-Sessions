package OopsConcepts;

public class MethodOrFunctionCreation 
{
	//Method Or Function is a definition block which performs certain action based on logic written in it.
	//We cannot create method inside a method [Nested Function is not Allowed].
	//Duplicate methods are not allowed with Same Method Name.
	//Functions are Parallel to each other - Independent to each other.
	
	//Static Methods can be called in 2 Ways:
	//A. Direct Calling by using its Variable Name or Method Name.
	//B. Using its Class Name.
	
	public static void main(String[] args) 
	{
		String date = "20-12-1993";
		dateFormatChange(date); //Direct Calling
		MethodOrFunctionCreation.dateFormatChange(date); //Calling Using its Class Name
		
		String employeeData = "Tom-25-Male-Infosys-Pune-QALead";
		printEmployeeData(employeeData); //Direct Calling
		MethodOrFunctionCreation.printEmployeeData(employeeData); //Calling Using its Class Name
		
		String employee1Data = "Peter-23-Male-Infosys-Mysore-TestAnalyst";
		printEmployeeData(employee1Data); //Direct Calling
		MethodOrFunctionCreation.printEmployeeData(employee1Data); //Calling Using its Class Name
		
		String empName = getEmployeeData(employeeData);
		System.out.println(empName);
	}
	
	public static void dateFormatChange(String dateToBePassed)
	{
		System.out.println("#######-Change Date-#######");
		String changedDate = dateToBePassed.replace("-", "/");
		System.out.println(changedDate);
	}
	
	public static void  printEmployeeData(String employeeInformation)
	{
		System.out.println("#######-Employee Data-########");
		String employee[] = employeeInformation.split("-");
		
		for(int i=0; i<employee.length; i++)
		{
			System.out.println(employee[i]);
		}
	}
	
	public static String getEmployeeData(String employeeInformation)
	{
		System.out.println("#######-Employee Name and Age-########");
		String employee[] = employeeInformation.split("-");
		String employeeFullName = employee[0]+" "+employee[1];
		return employeeFullName;
	}
}
