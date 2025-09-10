import java.util.Scanner;

public class gcd {

    public static int gcd(int a , int b ){
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b= sc.nextInt();
        System.out.println(" GCD:"+ gcd(a, b));
       
    }
}
