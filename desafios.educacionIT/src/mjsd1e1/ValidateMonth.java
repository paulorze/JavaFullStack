package mjsd1e1;
import java.util.Scanner;

public class ValidateMonth {
	public static int validateMonth() {
		Scanner userInput = new Scanner(System.in);
		try {
			boolean validMonth = false;
			int month;
			do {
				System.out.println("Por favor, ingrese el mes (en número formato 00):");
				month = userInput.nextInt();
				if (month >=0 && month <= 12)
					validMonth = true;
			} while (validMonth == false);
			return month;
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un número en formato 00.");
			return validateMonth();
		}
	}
}