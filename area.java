import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;
public class area {
    public static void main(String[] args) {
        int L,B;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the Rectangle:");
    L=sc.nextInt();
    System.out.println("Enter thr Breadth of the Rectangle:");
    B=sc.nextInt();
    int area=L*B;
    System.out.println("Area of the Rectangle is:"+area);
    }
}
