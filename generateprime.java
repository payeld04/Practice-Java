import java.util.*;
public class generateprime
{
    int check(int x)
    {
        int count=0;
        for(int i=1;i<=x;i++)    //counting the number of factors
        {
            if(x%i==0)
            count++;
        }
        if(count==2)
        return x;
        else
        return 0;
    }
    void calculate(int a,int b)
    {
        generateprime g= new generateprime();
        int y,sum=0,count=0;
        System.out.print("The prime numbers are: ");
        for(int i=a;i<=b;i++)
        {
            y=g.check(i);
            if(y!=0)
            {
                sum = sum+y;
                count++;
            }
        }
        System.out.println("Sum of all the primr numbers"+sum);
        System.out.println("Total number of prime numbers"+count);
    }
	public static void main(String[] args) 
	{
	    generateprime g= new generateprime();
	    Scanner Sc= new Scanner(System.in);
	    System.out.println("Enter two numbers for a range: ");
	    int a=Sc.nextInt();
		System.out.println("Hello World");
	}
}
