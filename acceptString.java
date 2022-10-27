import java.util.*;

public class acceptString {
	// First declaring variables
	// second import
	// third operations

	// Accept a string, accept the position and display the character

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any scentence: ");
		String str = scan.nextLine();

		int strLength = str.length() - 1;

		System.out.println("Enter a position: ");
		int position = scan.nextInt();

		if (position > strLength) {
			System.out.println("Invalid position! GREATER THAN STRING LENGTH");
		} else {
			char charAtPos = str.charAt(position);
			System.out.println("Your sentence was: " + str);
			System.out.println("The character at the given position is: " + charAtPos);
		}

		scan.close();
	}
}