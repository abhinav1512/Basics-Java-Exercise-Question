import java.util.*;

public class pattern {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       // int m =sc.nextInt();

       // 0-1 triangle
       for(int i=1; i<=n ;i++){
         for (int j=1;j<=i;j++)
         {
            int a=i+j;
            if(a%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
         }System.out.println();
       }

       // floyd triangle
    //    int a=1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1; j<=i;j++){
    //             System.out.print(a + " ");
    //             a++;
    //         }System.out.println();
    //     }

        // inverterd half pyramid pattern
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }System.out.println();
        //   }


       // number pattern
        //    for(int i=1;i<=n ;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }System.out.println();
        //    }


       // inverted half pyramid 180 degree
        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //          System.out.print(" ");
        //      }
        //      for (int j=1;j<=i;j++){
        //         System.out.print("*");
        //      }
        //      System.out.println();
        //  }

         // inverted half pyramid
        //  for(int i=n; i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }System.out.println();
        //  }

       // half pyramid
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }System.out.println();
        // }


        // print star pattern
        // for (int i=1; i<=n;i++){
        //     for(int j=1; j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
            
        // }

        // hollow rectangle
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=m;j++){
//         if(i==1 || j==1 || i==n || j==m){
//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
//     }
//        System.out.println();
// }
    }
}
