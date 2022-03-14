package g;
import java.util.Scanner;

public class Assignment3Q7 {
	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter first number(numerator): ");
		int numerator = inputDevice.nextInt();
		System.out.print("Please enter second number(denominator): ");
		int denominator = inputDevice.nextInt();		
		try {
			new Assignment3Q7().doDivide(numerator, denominator);
		} catch (Exception e) {
			System.out.println("Inside finally block ");
		}		
	}
	public void doDivide(int a, int b) throws Exception{
			float result = a/b;
			System.out.println("Division result of "+ a +"/"+b +"= " +result);
	}
}


