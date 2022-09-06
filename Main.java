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
	
	public static void main(String[] args) {
		System.out.println("We welcome you to our Temperature Conversion PROGRAM! 🙋‍♂️");
		System.out.println(COLOR_BLUE + "NOTE: You can do your operation INFINITELY 😊❕" + COLOR_RESET);

		System.out.println(" ");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose an option from below: ");
		System.out.println("Press 1: for Kelvin - Celsius");
		System.out.println("Press 2: for Celsius - Kelvin");
		System.out.println("Press 3: for Celsius - Fahrenheit");
		System.out.println("Press 4: for Fahrenheit - Celsius");
		System.out.println("Press 5: for Kelvin - Fahrenheit");
		System.out.println("Press 6: for Fahrenheit - Kelvin");

		System.out.println(" ");

		System.out.print("Enter your choice: ");
		int user_Inp = input.nextInt();
		
		double val_KEL = 273.15; // Default value of KELVIN
		while (user_Inp < 5)	{	
			switch (user_Inp) {
				case 1:
					System.out.println("KELVIN - CELSIUS");
					System.out.println(" ");
					System.out.print("Enter your KELVIN value: ");
	
					double temp_Kel = input.nextDouble();
	
					double change_Cel = temp_Kel - val_KEL; // Conversion: KELVIN - CELSIUS
	
					System.out.println(COLOR_GREEN + "➡ Temperature in CELSIUS is: " + change_Cel);
					System.out.println(COLOR_RESET);
	
					break;
	
				case 2:
					System.out.println("CELSIUS - KELVIN");
	
					System.out.println(" ");
					System.out.print("Enter your CELSIUS value: ");
					
					double temp_Cel = input.nextDouble();
	
					double change_Kel = temp_Cel + val_KEL;
					
					System.out.println(COLOR_GREEN + "➡ Temperature in KELVIN is: " + change_Kel + COLOR_RESET);
					System.out.println();
	
					break;

			}

			System.out.println();
			
			System.out.println("Choose an option from below: ");
			System.out.println("Press 1: for Kelvin - Celsius");
			System.out.println("Press 2: for Celsius - Kelvin");
			System.out.println("Press 3: for Celsius - Fahrenheit");
			System.out.println("Press 4: for Fahrenheit - Celsius");
			System.out.println("Press 5: for Kelvin - Fahrenheit");
			System.out.println("Press 6: for Fahrenheit - Kelvin");

			System.out.println();

			System.out.print("Enter your choice: ");
			user_Inp = input.nextInt();
		}
	}
}