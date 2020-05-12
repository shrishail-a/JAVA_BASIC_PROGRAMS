package programs;
import java.util.Scanner;

public class Fibonaci {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int result=0;
		int a=0;
		int b=1;
		System.out.print(a);
		System.out.print(" "+b);
			
		for(int i=0;i<n-2;i++)
		{
			result=a+b;
			a=b;
			b=result;
			
			System.out.print(" "+result);
			
		}
		
		
	}

}
