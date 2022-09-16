import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char letter[] = new char[]{'a','c','e','g','b','d','f','h'};
        System.out.println("enter the number:");
        int unmber= in.nextInt();
        System.out.println("enter the letter:");
        char cha=in.next().charAt(0);
        for (int i=0;i<8;i++){
            if (cha == letter[i]) {
                if(unmber%2==1){
                    System.out.println("Black");break;
                }
                else {
                    System.out.println("White");break;
                }
            }
                else {
                    if (unmber%2==0){
                        System.out.println("Black");break;
                    }
                    else {
                        System.out.println("White");break;
                    }

            }
        }
    }
}
