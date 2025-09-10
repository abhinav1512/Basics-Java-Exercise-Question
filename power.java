import java.util.*;
import java.math.*;
public class power {

    public static Double P(Double a ,Double b){
        Double c = Math.pow(a,b);
        return c;
    }
     public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

       System.out.println(" Enter  Base:");
       Double a = sc.nextDouble();

       System.out.println(" Enter  Power:");
       Double b = sc.nextDouble();
     Double c=  P(a,b);
     System.out.println(c);

    
    
    }
}
