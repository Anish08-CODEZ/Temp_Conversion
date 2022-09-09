import java.util.*;

public class afterDOT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name (with a dot between your name and surname): ");
		String name = scan.nextLine();
		
		int length_Name = name.length() - 1;
		char dot = '.';

		for (int i = 0; i <= length_Name; i++) {
			char c = name.charAt(i);
			if (c == dot) {
				System.out.println("The letter after \".\" is:  " + name.charAt(i + 1));
			}
		}

		scan.close();
	}
}