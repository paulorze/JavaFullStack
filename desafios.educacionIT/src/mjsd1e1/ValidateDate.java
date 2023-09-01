package mjsd1e1;

public class ValidateDate {
	public static void validateDate() {
		int year = ValidateYear.validateYear();
		int month = ValidateMonth.validateMonth();
		int day = ValidateDay.validateDay(year, month);
		String mensaje = String.format("Su fecha %d/%d/%d es válida.", year, month, day);
		System.out.println(mensaje);
	}
}