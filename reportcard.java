import java.util.Scanner;

//import javax.lang.model.util.ElementScanner6;
public class reportcard {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks of the Student:");
        marks=sc.nextInt();
        if(marks>=90)
        {
            System.out.println("A Grade");
        }
        else if(marks>=80)
        {
            System.out.println("B Grade");
        }
        else if(marks>=70)
        {
            System.out.println("C grade");
        }
        else if(marks>=60)
        {
            System.out.println("D Grade");
        }
        else if(marks>=50)
        {
            System.out.println("E Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
