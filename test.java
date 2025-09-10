import java.util.*;
public class test {

    public static int avg(int a,int b, int c){
        int calculate = (a+b+c)/3;                                                            
        return calculate;
    }
    public static void main( String args[]){

        
       System.out.println(" Average of 3 numbers");

       Scanner sc = new Scanner(System.in);

       System.out.println(" Enter first Number:");
       int a = sc.nextInt();

       System.out.println(" Enter second Number:");
       int b = sc.nextInt();
       
       System.out.println(" Enter third Number:");
       int c = sc.nextInt();

       int calculate = avg(a,b,c);
       System.out.println("Average:"+calculate);


    }
}
