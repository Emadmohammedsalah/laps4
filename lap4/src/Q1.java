public class Q1 {
    public static void main(String[] args) {
        int n=1;
        int m=-1;
        if(n<-m)
        {
            System.out.println(n);
        }
        else
        {
            System.out.println(m);
        }
        //-1
        if(-n>=m){
            System.out.println(n);
        }
        else {
            System.out.println(m);
        }
        //1
        { double x=0;
        double y=1;
        if(Math.abs(x-y)<1){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }}
        //1.0
        double x=Math.sqrt(2);
        double y=2;
        if(x*x==y){
            System.out.println(x);
        }
        else {
            System.out.println(y);
        }
        /*
        -1
        1
        1.0
        2.0
        */
    }
}
