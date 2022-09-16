import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        if(n1>n2&&n2>n3||n1<n2&&n2<n3) {
            System.out.println(n1+" "+n2+" "+n3+" "+" in order");
        }
        else {
            System.out.println(n1+" "+n2+" "+n3+" "+"not in order");
        }
    }
}
