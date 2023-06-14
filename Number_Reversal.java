//Write a java program to reverse the digits of an integer.

import java.util.Scanner;

public class Number_Reversal {
    public static void main (String[] args) throws java.lang.Exception
	{
	   int num;
       System.out.println("Enter a number :");
	 Scanner s = new Scanner(System.in);
		num = s.nextInt();
        int n = num;
        System.out.println();
		while(n!=0){
			int rem = n%10;
		     System.out.println(rem);
			n/=10;
		}
	}
}
