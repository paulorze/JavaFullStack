package mjsd2;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	Students StudentsList = new Students();
	int studentsQuantity = Console.studentsQuantity();
	int examsQuantity = Console.examsQuantity();
	for (int i = 0; i < studentsQuantity; i++) {
		String name = Console.addName();
		String lastname = Console.addLastname();
		ArrayList <Float> examResults = Console.addResults(examsQuantity);
		StudentsList.addStudent(name, lastname, examResults);
	};
	System.out.println("Los estudiantes que promocionaron la materia son:");
	ArrayList <Student> promotedStudents = StudentsList.getPromotedStudents();
	Console.printStudents(promotedStudents);
	System.out.println("Los estudiantes que desaprobaron la materia son:");
	ArrayList<Student> failedStudents = StudentsList.getFailedStudents();
	Console.printStudents(failedStudents);
	System.out.println("El estudiante que obtuvo el promedio mas alto fue:");
	Student highestStudent = StudentsList.getHighestStudent();
	Console.printStudent(highestStudent);
	System.out.println("El estudiante que obtuvo el promedio mas bajo fue:");
	Student lowestStudent = StudentsList.getLowestStudent();
	Console.printStudent(lowestStudent);
	};
}