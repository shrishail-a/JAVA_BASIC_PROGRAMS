package programs;
import java.util.*;
public class Decimal_to_binary {
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal Number");
		int n =s.nextInt(); 
        decToBinary(n);
	}
		
		
	static void decToBinary(int n) 
    { 
         
        int[] binaryNum = new int[1000]; 
   
        
        int i = 0; 
        while (n > 0)  
        { 
            
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   

        for (int j = i - 1; j >= 0; j--) 
        	
            System.out.print(binaryNum[j]); 
            
 
    } 
      
   
} 
  

