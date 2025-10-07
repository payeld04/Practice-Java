
import java.util.*;
public class AssignGrades
{
	public static void main(String[] args) 
	{ 
	    Scanner Sc=new Scanner(System.in);
	    System.out.print("Enter the name: ");
	    String nm= Sc.nextLine();
		  System.out.println("Enter marks of three subjects: ");
		    double mk1=Sc.nextDouble();
		    double mk2=Sc.nextDouble();
		    double mk3=Sc.nextDouble();
		
		//calculating the persentage
		double per=((mk1+mk2+mk3)/(20*3))*100;
    //Assigning grades on checking their percentage
		if(per>=90 && per<=100)                  
		   System.out.print(nm+"got grade S");
		else if(per>=80 && per<90)
		   System.out.print(nm+"got grade A");
		else if(per>=70 && per<80)
		   System.out.print(nm+"got grade B");
		else if(per>=60 && per<70)
		   System.out.print(nm+"got grade C");
		else if(per>=50 && per<60)
		   System.out.print(nm+"got grade D");
		else
		   System.out.print(nm+"got grade F");
	}
}
