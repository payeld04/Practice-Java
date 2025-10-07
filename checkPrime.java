
import java.util.*;
public class checkPrime
{
    int check(int x)
    {
	    int count=0;
		for (int i=1;i<=x;i++)      //counting the number of factors
		{
		    if(x%i==0)
		    count++;
		}
		
		//checking whether number of factors are 2 or not and returning the number itself, if it is a prime else it returns 0 
		if(count==2)
		return x;
		else
		return 0;
    }
    void calculate(int a, int b)
    {
        checkPrime C = new checkPrime();
        int y,sum=0,count=0;
	    System.out.println("Prime rangers are: ");
	    for (int i=a;i<=b;i++)
	    {
	        y=C.check(i);
	        if(y!=0) {
	            System.out.println(y);
	            sum=sum+y;
	            count++;
	        }
	    }
	    System.out.println("Sum of all the prime numbers: " + sum);
	    System.out.println("Total number of prime numbers:  " + count);
    }
	public static void main(String[] args) 
	{
	    checkPrime C = new checkPrime();
	    Scanner Sc= new Scanner(System.in);
		System.out.println("Enter ist number for a range: ");
	    int a= Sc.nextInt();
	    System.out.println("Enter 2nd number for a range: ");
	    int b= Sc.nextInt();
	    if(a<b && a>0)
	    {
	       C.calculate(a, b) ;
	    }
	    else {
	        System.out.print("The range is invalid!!");
	    }
	}
}
