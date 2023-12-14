//Program to find the greatest among three

import java.util.Scanner;
public class GreatestThree
{
    public static void main(String args[])
    {
        System.out.print("\nEnter three numbers .............. ");
        Scanner reader = new Scanner(System.in);
        System.out.println("\nEnter the first number : ");
        int num1 = reader.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = reader.nextInt();
        System.out.println("Enter the third number : ");
        int num3 = reader.nextInt();
        reader.close();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest number =" + num1);
            } else {
                System.out.println("The greatest number =" + num3);
            }
        }
         else{
             if (num2>num3) {System.out.println("The greatest number =" + num2);}
            else {System.out.println("The greatest number =" + num3);}
        }
    }
}
