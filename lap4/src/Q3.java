import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of x:");
        int x=in.nextInt();
        if (x==0){
            System.out.println("0");
        }
        else if(x>0){
            System.out.println("positive number:");

        }
        else {
            System.out.println("negative number:");

        }
    }
}
