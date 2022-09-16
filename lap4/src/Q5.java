import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 3 number:");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        if(n1==n2&&n1==n3)
        {
            System.out.println("all the same");
        }
        else if (n1!=n2&&n1!=n3&&n2!=n3){
        System.out.println("all different");
    }
    else {
          System.out.println("neither");
        }
    }
}
