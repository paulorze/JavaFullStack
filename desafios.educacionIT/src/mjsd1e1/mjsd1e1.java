package mjsd1e1;
import java.util.Scanner;

public class mjsd1e1 {
	public static void main (String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean again = false;
		do {
			ValidateDate.validateDate();
			System.out.println("¿Desea validar otra fecha? S/N");
			String respuesta = userInput.nextLine();
			if (respuesta.equals("S")) {
				again = true;}
			else
				again = false;
		} while(again == true);
		System.out.println("Gracias por utilizar nuestro programa.");
	}
}