package programs;
import java.util.Scanner;
public class Sum_Of_N_Numbers 
{

		public static void main(String []args)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		int sum=0;
		
		System.out.println("the sum of"+n+" Numbers:");
		for(int i = 1 ; i <= n ; i++)
		{
			sum=sum+i;
			System.out.println(i);
		}
		System.out.println("TOTAL:-"+sum);
		
		}

}


