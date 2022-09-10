import java.util.Scanner;

public class nameAddress {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Enter your address: ");
		String address = scan.nextLine();

		System.out.println("Your name is: " + name);
		System.out.println("Your address is: " + address);

		scan.close();
	}
}