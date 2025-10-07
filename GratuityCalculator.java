import java.util.*;
public class GratuityCalculator
{
	public static void main(String[] args) 
	{
	    Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the subtotal and gratuity rate:");
		double subtotal=Sc.nextDouble();                                                                                                                                                                                                                                                                                                                                                                                             
		double gratuityRate=Sc.nextDouble();
		double gratvalue=(gratuityRate*subtotal)/100.0;
		double gratTotal=subtotal+gratvalue;
		System.out.print("The gratuity is $"+gratvalue+"and the total is"+gratTotal);
	}
}
