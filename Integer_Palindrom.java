package programs;
import java.util.Scanner;

public class Integer_Palindrom 
{
	public static void main(String []args)
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int original=s.nextInt();
		int g=original;
		int reverse=0;
		
		while(g>0)
		{
		int r=g%10;
		reverse=reverse*10+r;
		g=g/10;
		}
		
		if(original==reverse)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not a palindrom");
		}
		
	}
	

}
 