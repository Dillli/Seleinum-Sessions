package OopsConcepts;

public class MultipleInheritance_C_FortisHospital implements MultipleInheritance_A_IndianHospital, MultipleInheritance_B_UKHospital
{
	@Override
	public void physioServices() 
	{
		System.out.println("Fortis Hospital - Physio Services");
	}

	@Override
	public void clinicalServices() 
	{
		System.out.println("Fortis Hospital - Clinical Services");
	}

	@Override
	public void pathologyServices() 
	{
		System.out.println("Fortis Hospital - Pathology Services");
	}

	@Override
	public void neuroServices()
	{
		System.out.println("Fortis Hospital - Neuro Services");
	}

	@Override
	public void orthopedicServices() 
	{
		System.out.println("Fortis Hospital - Orthopedic Services");
	}
	
	public void ambulanceServices()
	{
		System.out.println("Fortis Hospital - Ambulance Services");
	}
}
