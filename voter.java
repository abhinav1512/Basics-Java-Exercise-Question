import java.util.Scanner;

public class voter {

    public static void voter(int a){
         if(a>18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("not Eligible");
        }
        
    }

    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

       System.out.println(" Enter Age:");
       int a = sc.nextInt();

      voter(a);
    
    
    
    }
    
}
