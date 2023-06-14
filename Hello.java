// Your First Program

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
          int a ; 
          System.out.println(" Enter any number :  ");
           a = scn.nextInt();
        System.out.println("Hello, World!"); 
        System.out.println("The number you have entered is : "+ a );
    }
}