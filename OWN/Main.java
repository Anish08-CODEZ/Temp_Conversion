import java.util.*;

/*
	Title: Temperature conversion
	Author: Whole School Team
*/

public class Main {
	// Declaring COLOR_RESET so that we can reset the color
	public static final String COLOR_RESET = "\u001B[0m";

	// Declaring the color
	// Custom declaration
	public static final String COLOR_BLUE = "	\u001B[34m";
	public static final String COLOR_GREEN = "\u001B[32m";
	public static final String COLOR_CYAN = "\u001B[36m";
	public static final String COLOR_RED = "\u001B[31m";
	public static final String COLOR_WARN = "\u001B[33m";

	public static void main(String[] args) {
		System.out.println("We welcome you to our Temperature Conversion PROGRAM! 🙋‍♂️");
		System.out.println(COLOR_BLUE + "NOTE: You can do your operation INFINITELY 😊❕" + COLOR_RESET);

		System.out.println(" ");

		System.out.println(COLOR_WARN + "WARNING: If you enter number exeding 10 PROGRAM will end!" + COLOR_RESET);

		Scanner input = new Scanner(System.in);

		System.out.println("\n" + "Choose an option from below: ");
		System.out.println("Press 1: for Kelvin - Celsius");
		System.out.println("Press 2: for Celsius - Kelvin");
		System.out.println("Press 3: for Celsius - Fahrenheit");
		System.out.println("Press 4: for Fahrenheit - Celsius");
		System.out.println("Press 5: for Kelvin - Fahrenheit");
		System.out.println("Press 6: for Fahrenheit - Kelvin");

		System.out.print("\n" + "Enter your choice: ");
		int user_Inp = input.nextInt();

		double val_KEL = 273.15; // Default value of KELVIN
		do {
			switch (user_Inp) {
				case 1:
					System.out.println(COLOR_CYAN + "You choosed: KELVIN - CELSIUS" + COLOR_RESET);
					System.out.println(" ");
					System.out.print("Enter your KELVIN value: ");

					double temp_Kel = input.nextDouble();

					double change_Cel = temp_Kel - val_KEL; // Conversion: KELVIN - CELSIUS

					System.out.println(COLOR_GREEN + "➡ Temperature in CELSIUS is: " + change_Cel);
					System.out.println(COLOR_RESET);

					System.out.println(
							"-------------------OPERATION COMPLETED-------------------");

					break;

				case 2:
					System.out.println(COLOR_CYAN + "You choosed: CELSIUS - KELVIN" + COLOR_RESET);
					
					System.out.print("\n" + "Enter your CELSIUS value: ");

					double temp_Cel = input.nextDouble();

					double change_Kel = temp_Cel + val_KEL;

					System.out.println(COLOR_GREEN + "➡ Temperature in KELVIN is: " + change_Kel + COLOR_RESET);

					System.out.println(
							"-------------------OPERATION COMPLETED-------------------");

					break;

				case 3:
					System.out.println(COLOR_CYAN + "You choosed: CELSIUS - FARENHEIT" + COLOR_RESET);
					
					System.out.print("\n" + "Enter your CELSIUS value: ");

					double temp_Cel_1 = input.nextDouble();
					double change_Faren = (temp_Cel_1 * 9 / 5) + 32;

					System.out.println(COLOR_GREEN + "➡ Temperature in FARENHEIT is: " + change_Faren + COLOR_RESET);

					System.out.println(
							"-------------------OPERATION COMPLETED-------------------");

					break;

				case 4:
					System.out.println(COLOR_CYAN + "You choosed: FARENHEIT - CELSIUS" + COLOR_RESET);

					System.out.print("\n" + "Enter your FARENHEIT value: ");

					double temp_Faren = input.nextDouble();
					double change_Cel_2 = (temp_Faren - 32) * 5 / 9;

					System.out.println(COLOR_GREEN + "➡ Temperature in FARENHEIT is: " + change_Cel_2 + COLOR_RESET);

					System.out.println(
							"-------------------OPERATION COMPLETED-------------------");

					break;

				case 5:
					System.out.println(COLOR_CYAN + "You choosed: KELVIN - FARENHEIT" + COLOR_RESET);

					System.out.print("\n" + "Enter your KELVIN value: ");

					double temp_Kel_1 = input.nextDouble();
					double change_Faren_1 = (temp_Kel_1 - val_KEL) * 9/5 + 32;
					System.out.println(COLOR_GREEN + "➡ Temperature in FARENHEIT is: " + change_Faren_1 + COLOR_RESET);

					System.out.println(
							"-------------------OPERATION COMPLETED-------------------");

					break;

				case 6: 
					System.out.println(COLOR_CYAN + "You choosed: FARENHEIT - KELVIN" + COLOR_RESET);

					System.out.print("\n" + "Enter your FARENHEIT value: ");

					double temp_Faren_1 = input.nextDouble();
					double change_Kel_1 = (temp_Faren_1 - 32) * 5/9 + val_KEL;

					System.out.println(COLOR_GREEN + "➡ Temperature in KELVIN is: " + change_Kel_1 + COLOR_RESET);

				default:
					System.out.println(COLOR_RED + "---------------You entered a wrong choice---------------" + COLOR_RESET);
			}

			System.out.println("\n" + "Choose an option from below: ");
			System.out.println("Press 1: for Kelvin - Celsius");
			System.out.println("Press 2: for Celsius - Kelvin");
			System.out.println("Press 3: for Celsius - Fahrenheit");
			System.out.println("Press 4: for Fahrenheit - Celsius");
			System.out.println("Press 5: for Kelvin - Fahrenheit");
			System.out.println("Press 6: for Fahrenheit - Kelvin");

			System.out.print("\n" + "Enter your choice: ");
			user_Inp = input.nextInt();
		} while (user_Inp < 10);
	}
}