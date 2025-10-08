import java.util.*;
class Grader
{
    double score;
    Grader (double x) {
        score=x;
    }
    char letterGrade() {
        if(score<=100 && score>90)
        return 'O';
        else if(score<=90 && score>80)
        return 'E';
        else if(score<=80 && score>70)
        return 'A';
        else if(score<=70 && score>60)
        return 'B';
        else if(score<=60 && score>50)
        return 'C';
        else if(score<50)
        return 'F';
        else
        return '\u0000';
    }
}
public class sample
{
    public static void main(String[] args) {
        
        Scanner Sc= new Scanner(System.in);
        System.out.print("Enter your score:");
        double z=Sc.nextDouble();
        if(z>=0 && z<=100) {
            Grader y= new Grader(z);
            System.out.println("You obtained grade "+y.letterGrade());
        }
        else {
            System.out.println("Your score is invalid.Your score is not between 0 and 100.");
        }
    }
}
