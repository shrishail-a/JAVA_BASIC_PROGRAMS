package programs;
import java.util.Scanner;

public class Calculator {
	
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter two number");
	int a=s.nextInt();
	int b=s.nextInt();
	int result=0;
	System.out.println(" 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division \n 5. Exit");
	System.out.println("Enter your choice");
	int ch=s.nextInt();
	switch(ch)
	{
	case 1: result=a+b;
			System.out.println(result);
			break;
	case 2: result=a-b;
			System.out.println(result);
			break;
	case 3: result=a*b;
			System.out.println(result);
			break;
	case 4: result=a/b;
			System.out.println(result);
			break;
	case 5: break;
	default: System.out.println("Invalid Choice");
			
	}
}

}
