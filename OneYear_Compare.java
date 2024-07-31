import java.util.*;
public class OneYear_Compare
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		Date currentdate = cal.getTime(); 
		
		cal.add(Calendar.YEAR, 1); 
		Date nextyear = cal.getTime();
		
		cal.add(Calendar.YEAR, -2); 
		Date previousyear = cal.getTime();
	
		System.out.println("Current Date : " + currentdate);
		System.out.println("Date Before One Year : " + previousyear );
		System.out.println("Date After One Year  : " + nextyear );  	
	}
}