package JavaConceptsExamples;

import java.text.SimpleDateFormat;

public class Date_Previous_Current_Next
{
	public static void main(String[] args)
	{
		String PreviousDate = new SimpleDateFormat("dd-MM-yyyy").format(System.currentTimeMillis()-24*60*60*1000);
		String CurrentDate = new SimpleDateFormat("dd-MM-yyyy").format(System.currentTimeMillis());
		String NextDate = new SimpleDateFormat("dd-MM-yyyy").format(System.currentTimeMillis()+24*60*60*1000);
	
		System.out.println("Previous Date is ::: " +PreviousDate);
		System.out.println("Current Date is  ::: " +CurrentDate);
		System.out.println("Next Date is     ::: " +NextDate);
	}
}
