package programs;
import java.util.Scanner;

public class Armstrong_Number {
	public static void main(String []args)
	{
		int len=0,m,l=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		int temp1=num;
		
		while(temp!=0)
		{
		temp=temp/10;
		len=len+1;
		}
		
		while(temp1!=0)
		{
			int k=1;
			m=temp1%10;
			for(int j=0;j<len;j++)
			{
				k=k*m;
			}
			
			l=l+k;
			temp1=temp1/10;
			
		}
		
		if(num==l)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
			
	}

}
