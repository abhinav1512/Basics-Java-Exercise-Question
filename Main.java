import java.util.*;

public class Main {

	// sum of all odd numbers
	public static int odd(int n){
      int sum =0 ;

	  for(int i =1;i<=n;i++){
		if(i%2!=0){
			sum = sum+i;
		}
	  }
	  return sum;
	}
		public static void main (String []args){
	    
			Scanner sc = new Scanner(System.in);
			int n= sc.nextInt();
         
			int sum = odd(n);
			System.out.println("The sum of odd Numbers:"+ sum);
		
	}
}
