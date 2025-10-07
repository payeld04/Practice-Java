import java.util.*;
public class Calculator
{
	public static void main(String[] args) 
	{ 
	    Scanner Sc=new Scanner(System.in);
	    System.out.print("Enter the first number: ");
	    int num1= Sc.nextInt();
	    System.out.print("Enter the second number: ");
		int num2= Sc.nextInt();
		System.out.print("Enter an operator(+,-,*,/): ");
		char op=Sc.next().charAt(0);
		
		switch(op)
		{
		case '+': 
		    System.out.print("Result: "+(num1+num2));break;
		case '-':
		    System.out.print("Result: "+Math.abs(num1-num2)); break;
		case '*':
		     System.out.print("Result: "+(num1*num2)); break;
		case '/':
		    if(num2!=0)
		    {
		     System.out.print("Result: "+(num1/num2)); break;
		    } else {
		        System.out.print("Error:Division by Zero is not allowed.");
		    }
		        break;
		        default:
		        System.out.print("Error: Invalid operator.");
		}
	}
}
