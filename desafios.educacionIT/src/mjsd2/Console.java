package mjsd2;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
	public static int studentsQuantity () {
		System.out.println("Ingrese la cantidad de estudiantes en el curso:");
		Scanner scanner = new Scanner(System.in);
		try {
			int studentsQuantity = scanner.nextInt();
			return studentsQuantity;
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un numero entero.");
			return studentsQuantity();
		}
	};
	
	public static int examsQuantity () {
		System.out.println("Ingrese la cantidad de exámenes que se tomaron en el curso:");
		Scanner scanner = new Scanner(System.in);
		try {			
			int examsQuantity = scanner.nextInt();
			return examsQuantity;
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un numero entero.");
			return examsQuantity();
		}
	};
	
	public static String addName() {
		System.out.println("Por favor, ingrese el nombre del estudiante:");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		if (name.trim().length() > 0 ) return name;
		return addName();
	};
	
	public static String addLastname() {
		System.out.println("Por favor, ingrese el apellido del estudiante:");
		Scanner scanner = new Scanner(System.in);
		String lastname = scanner.nextLine();
		if (lastname.trim().length() > 0) return lastname;
		return addLastname();
	};
	
	public static Float addResult (int examNumber) {
		String examLine = String.format("Agregue el resultado del examen %d:", examNumber);
		System.out.println(examLine);
		Scanner scanner = new Scanner(System.in);
		try {
			Float result = scanner.nextFloat();
			if (result >= 0 && result <= 10) {
				return result;
			};
			return addResult(examNumber);
		} catch (Exception e) {
			System.out.println("Por favor, ingrese un numero.");
			return addResult(examNumber);
		}
	};
	
	public static ArrayList<Float> addResults(int examsQuantity) {
		ArrayList<Float> examResults = new ArrayList<>();
		for (int i = 1; i <= examsQuantity; i++) {
			examResults.add(addResult(i));
		};
		return examResults;
	};
	
	public static void printStudent (Student Student) {
		System.out.println(Student.getStudentName());
	};
	
	public static void printStudents (ArrayList <Student> Students) {
		for (Student student : Students) System.out.println(student.getStudentName());
	};
}
