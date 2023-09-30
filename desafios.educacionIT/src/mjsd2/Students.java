package mjsd2;

import java.util.ArrayList;

public class Students {
	ArrayList <Student> Students;
	public Students() {
		Students = new ArrayList<>();
	};
	
	public void addStudent (String name, String lastname, ArrayList<Float> Results) {
		Student newStudent = new Student(name, lastname);
		for (Float Result : Results) {
			newStudent.addResult(Result);
		};
		Students.add(newStudent);
	};
	
	public ArrayList<Student> getPromotedStudents () {
		ArrayList <Student> PromotedStudents = new ArrayList<>();
		for (Student Student : Students) {
			if (Student.getAverage() >= 7) PromotedStudents.add(Student);
		};
		return PromotedStudents;
	};
	
	public ArrayList<Student> getFailedStudents () {
		ArrayList <Student> FailedStudents = new ArrayList<>();
		for (Student Student : Students) {
			if (Student.getAverage() < 7) FailedStudents.add(Student);
		};
		return FailedStudents;
	};
	
	public Student getHighestStudent() {
		Student HighestStudent = null;
		int HighestAverage = 0;
		for (Student student : Students) {
			int average = student.getAverage();
			if (average > HighestAverage ) {
				HighestStudent = student;
				HighestAverage = average;
			};
		};
		return HighestStudent;
	};
	
	public Student getLowestStudent() {
		Student LowestStudent = null;
		int LowestAverage = 10;
		for (Student student : Students) {
			int average = student.getAverage();
			if (average < LowestAverage ) {
				LowestStudent = student;
				LowestAverage = average;
			};
		};
		return LowestStudent;
	};
}
