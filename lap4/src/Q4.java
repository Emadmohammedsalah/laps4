import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int x ,value1=in.nextInt();
       x= Math.abs(value1);
       String y=String.valueOf(x);
       System.out.println("The number counter is:"+y.length());


    }
}
