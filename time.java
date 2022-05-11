import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int time;
        System.out.println("Enter the time in 24 hours format:");
        time=sc.nextInt();
        if(time<12)
        {
            System.out.println("Good Morning");
        }
        else if(time<=16)
        {
            System.out.println("Good Afternoon");
        }
        else if(time<=20)
        {
            System.out.println("Good Evening");
        }
        else
        {
            System.out.println("Good Night");
        }
    }
}
