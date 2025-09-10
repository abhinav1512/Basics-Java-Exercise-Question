//import java.util.Scanner;
import java.util.*;
public class count {
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

       System.out.println(" Enter  Number:");
       int n = sc.nextInt();
       int positive =0;
       int negative=0;
       int zero =0;


       for(int i=1;i<=n;i++){
        int a = sc.nextInt();
        if(a >0){
            positive =positive+1;
        }
        else if(a <0){
            negative =negative+1;
        }
        else{
            zero=zero+1;
        }
       }

       System.out.println("positive"+ positive);
       System.out.println("negative"+ negative);
       System.out.println("zero " + zero);
    
    
    
    }
}
