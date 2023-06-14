import java.util.Scanner;

public class Addition {
    public static void main(String [] args){
        // taking two values from the user and returning the addition of the numbers :: 
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the two number:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int result = add(a,b);
        System.out.println("Addition of two number: "+result);
    }
    public static int add(int a , int b){
        return a+b;
    }
}
