
import java.util.*;

public class GrossSalaryCalculator 
{
    public static void main(String[] args) 
    {
        Scanner Sc= new Scanner(System.in);

        System.out.print("Enter Basic Salary: ₹ ");    // Input: Basic Salary
        double basicSalary = Sc.nextDouble();

        double daPer;     // Determine DA percentage based on Basic Salary
        if (basicSalary <= 10000) 
        {
            daPer = 15;
        } else if (basicSalary <= 20000) 
        {
            daPer = 20;
        } else if (basicSalary <= 30000) 
        {
            daPer = 25;
        } else 
        {
            daPer = 30;
        }

        double dearnessAllowance = (daPer / 100) * basicSalary;    // Calculate DA and Gross Salary
        double grossSalary = basicSalary + dearnessAllowance;

        System.out.printf("Basic Salary", "DA" , "Gross Salary");  // Output the results in the required format
        System.out.printf("%15.2f %10.2f %15.2f\n",basicSalary, dearnessAllowance, grossSalary);
    }
}

