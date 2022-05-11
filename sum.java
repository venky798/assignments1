import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Integer 1:");
        num1=sc.nextInt();
        System.out.println("Enter the value of Integer 2:");
        num2=sc.nextInt();
        int Sum=num1+num2;
        System.out.println("Addition of two Integers:"+Sum);
    }
}
