import java.util.Scanner;
import java.lang.Math;
public class FloatingDigit 
{  
  public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter first number :  ");
		double n1 = reader.nextDouble();
		
		System.out.print("\nEnter Second number :  ");
        double n2 = reader.nextDouble();
		  reader.close();
		if (Math.abs(n1-n2) <= 0.001 ){
			System.out.print("\nEntered both numbers are same.");
		}
		else{
			System.out.print("\nEntered numbers are different. ");
		}
    }
}