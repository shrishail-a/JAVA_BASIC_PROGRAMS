package programs;
import java.util.Scanner;
public class Counting_Number_Digits {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s.nextInt();
		int count=0;
		
		while(num!=0)
		{
			int rem=num%10;
			count=count+1;
			num=num/10;
		}
		
		System.out.println(count);
	}

}
