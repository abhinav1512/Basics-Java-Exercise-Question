import java.util.Scanner;

public class largenum {

    public static int largenum(int a ,int b){
        int c=0;
        if(a>b){
            c=a;
        }else{
            c=b;
           // System.out.println(b);
        }
        return c;
    }
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

       System.out.println(" Enter first Number:");
       int a = sc.nextInt();

       System.out.println(" Enter second Number:");
       int b = sc.nextInt();
        
       int large = largenum(a,b);
       System.out.println("the greater number is  "+ large);
    }
}
