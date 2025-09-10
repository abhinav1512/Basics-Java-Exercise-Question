import java.util.*;

public class advancepatterns {
    public static void main(String args[]){

        // butterfly patterns
        int n=5;
        // upper half
        for(int i=1; i<=n;i++)
        { // first part
            for (int j= 1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int space =2 *(n-1);
            for(int j=1;j<=space;j++){
                Sytem.out.print(" ");
            }

        }
    }
}
