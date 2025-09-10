import java.util.Scanner;

public class circumference {

    public static float R(int a){
        float c = 2* a* 22/7 ;
      return c;
    }
    public static void main(String args[]) {

         Scanner sc = new Scanner(System.in);

       System.out.println(" Enter radius:");
       int a = sc.nextInt();

       float r = R(a);
       System.out.println(" circumference"+ r);


}
}
