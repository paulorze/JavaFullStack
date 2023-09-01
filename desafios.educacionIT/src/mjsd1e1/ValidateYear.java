package mjsd1e1;
import java.util.Scanner;

public class ValidateYear {
	public static int validateYear() {
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Por favor, ingrese el año  (en número formato 0000):");
		try {
			int year = userInput.nextInt();
			if (year >= 1900 && year <= 2099)
				return year;
			else
				System.out.println("El año ingresado no es válido.");
				return validateYear();
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un número en formato 0000.");
			return validateYear();
		}	
	}
}