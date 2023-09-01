package mjsd1e1;
import java.util.Arrays;
import java.util.Scanner;

public class ValidateDay {
	final static Integer[] leapYears = {1904, 1908, 1912, 1916, 1920, 1924, 1928, 1932, 1936, 1940, 1944, 1948, 1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096};
	final static Integer[] longMonth = {1, 3, 5, 7, 8, 10, 12};
	
	private static boolean inArray (Integer[] arr, int value) {
		boolean resultado = Arrays.asList(arr).contains(value);
		return resultado;
	}
	
	private static int validDay (int topLimit, int value, int year, int month) {
		if (value >=1 && value <= topLimit)
			return value;
		else
			System.out.println("El día ingresado no es válido.");
			return validateDay(year, month);
	}
	
	public static int validateDay(int year, int month) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Por favor, ingrese el día (en número formato 00): ");
		try {
			int day = userInput.nextInt();
			if (inArray(longMonth, month))
				return validDay(31, day, year, month);
			else if (month == 2 && inArray(leapYears, year))
				return validDay(29, day, year, month);
			else if (month == 2 && !inArray(leapYears, year))
				return validDay(28, day, year, month);
			else
				return validDay(30, day, year, month);
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un número en formato 00.");
			return validateDay(year, month);
		}
	}
	
	public static void prueba() {
		boolean carlitos = inArray(leapYears, 2000);
		System.out.println(carlitos);
	}
}