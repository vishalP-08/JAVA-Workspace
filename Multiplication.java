import java.util.Scanner;

public class Multiplication {
    public static void main(String [] arg){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        int multi = num1 * num2;

        System.out.println("The multiplication of two numbers is : "+multi);
    }
    
}
