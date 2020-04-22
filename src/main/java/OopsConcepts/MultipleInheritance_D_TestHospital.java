package OopsConcepts;

public class MultipleInheritance_D_TestHospital 
{
	public static void main(String[] args) 
	{
		//Using Fortis Hospital Class Reference Variable We can access methods that belongs to all Interface
		//Because all Interfaces are implemented in Fortis Hospital Class.
		MultipleInheritance_C_FortisHospital fortisTest = new MultipleInheritance_C_FortisHospital();
		fortisTest.physioServices();
		fortisTest.clinicalServices();
		fortisTest.pathologyServices();
		fortisTest.neuroServices();
		fortisTest.orthopedicServices();
		fortisTest.ambulanceServices();
		
		System.out.println("########################################");
		
		//Child Class Object Can be Referred by Parent Class Reference Variable
		//But Using Parent Class Reference Variable We can access only and only methods that belongs to Parent Class
		MultipleInheritance_A_IndianHospital IndianHospital= new MultipleInheritance_C_FortisHospital();
		IndianHospital.physioServices();
		IndianHospital.clinicalServices();
		IndianHospital.pathologyServices();
		
		System.out.println("########################################");
		
		//Child Class Object Can be Referred by Parent Class Reference Variable
		//But Using Parent Class Reference Variable We can access only and only methods that belongs to Parent Class
		MultipleInheritance_B_UKHospital UKHospital= new MultipleInheritance_C_FortisHospital();
		UKHospital.neuroServices();
		UKHospital.orthopedicServices();
	}
}
