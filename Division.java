import java.util.Scanner;

public class Division {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        //Taking the input from user :
        System.out.println("Enter the two Number to divide: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        // dividing the numvers and storing result in div
        int div = num1 / num2 ;

        // printing div as an output

        System.out.println("The division of  two number is : "+div);
    }
}
