import java.util.Scanner;

public class fibonacci {
     
    public static int fib(int a){
        
        if(a==0)
         return a;
         if(a==1)
         return a;
         return fib(a-1)+fib(a-2);
       
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter Number");
        int a = sc.nextInt();
        System.out.println("Fibonacci Series:"+" ");
         for(int i=0;i<=a;i++){
             System.out.print(fib(i) + " ");
        }
    }
}
