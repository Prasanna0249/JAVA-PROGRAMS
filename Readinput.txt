import java.util.Scanner;
public class Readinput
{
  public static void main(String args[])
   { 
     System.out.println("\nEnter a number = ");
     Scanner reader = new Scanner(System.in); // Object creator
     int num = reader.nextint();
     System.out.println("\nEntered number is "+ num);
    }
}