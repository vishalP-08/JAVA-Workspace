import java.util.Scanner;

public class Substraction {
    public static  void main(String [] arg){
        Scanner s = new Scanner(System.in);

        // Taking the input of two numbers : 
        System.out.println("Enter the Two numbers : ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        // substracting the two numbers and storing the value in subs: 
        int subs = num1 - num2;
        
        //Now print the value of subs as out put :
        
        System.out.println("The substraction of two numbers is : "+subs);
    }
}
