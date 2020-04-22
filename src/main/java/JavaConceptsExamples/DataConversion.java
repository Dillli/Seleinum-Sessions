package JavaConceptsExamples;

public class DataConversion 
{
	public static void main(String[] args)
	{
		//Data Conversion Converting from One Data Type to Another Data Type
		//Below are Wrapper Classes
		//Integer, Short, Long, Float, Double, Character, boolean
		
		//String to Int
		String x = "100";
		System.out.println(x+20); //10020
		int x1 = Integer.parseInt(x);
		System.out.println(x1+20); //120
		
		String total = "100";
		System.out.println(total+200); //100200
		int total1 = Integer.parseInt(total);
		System.out.println(total1+200); //300
		
		//For below we get NumberFormat Exception
		//String num = "100A";
		//int num1 = Integer.parseInt(num);
		//System.out.println(num1);
		
		//String to Double
		String a = "100.20";
		double a1 = Double.parseDouble(a);
		System.out.println(a1);
		
		//Int to String
		int b = 1000;
		String b1 = String.valueOf(b);
		System.out.println(b1);
		
		int c = 1000;
		String c1 = Integer.toString(c);
		System.out.println(c1);
	}
}
