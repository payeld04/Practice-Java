import java.util.*;
public class Eligibilitycheck
{
	public static void main(String[] args) 
	{ 
	    Scanner Sc=new Scanner(System.in);    //create sc as a scanner object for input
		System.out.print("Enter the name of a person=");    //user input for name and age
		String nm= Sc.nextLine();
		System.out.print("Enter the age of a person=");
		int age= Sc.nextInt();
		if(age>=18 && age<=70)      //check for eligibility for driving license
		    	System.out.print(nm+ " Is eligible for driving license.");
		else 
		    System.out.print(nm+ "Is not eligible for driving license.");
		
	}
}
        
