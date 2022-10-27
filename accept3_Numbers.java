import java.util.Scanner;

public class accept3_Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double num1 = scan.nextDouble();

		System.out.print("Enter second number: ");
		double num2 = scan.nextDouble();

		System.out.print("Enter third number: ");
		double num3 = scan.nextDouble();

		double sum = num1 + num2 + num3;
		double average = sum / 3;

		System.out.println("The average of 3 numbers is: " + average);
	}
}