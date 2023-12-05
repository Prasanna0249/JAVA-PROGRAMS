import java.util.Scanner;

public class InputOutput{
    public static void main(String args[])
{
    System.out.print("Enter a number = ");
    Scanner reader = new Scanner(System.in);
    int  num = reader.nextInt();
    System.out.print("Entered value = " + num);

}

}