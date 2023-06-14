import java.util.Scanner;

public class SI_calcutor {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter The P, R, T :");
		double a= scr.nextDouble();
		double b= scr.nextDouble();
		double c= scr.nextDouble();

		double si=(a*b*c)/100;

		System.out.print("Simple interest = "+si);
		
	}
}
