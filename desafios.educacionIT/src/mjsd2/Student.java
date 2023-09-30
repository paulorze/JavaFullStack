package mjsd2;

import java.util.ArrayList;

public class Student {
	String name;
	String lastname;
	ArrayList<Float> ExamResults;
	
	public Student(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
		ExamResults = new ArrayList<>();
	};
	
	public void addResult(Float Result) {
		ExamResults.add(Result);
	};
	
	public String getStudentName() {
		return name + ' ' + lastname;
	};

	public int getAverage() {
		int ExamsQuantity = this.ExamResults.size();
		int TotalResult = 0;
		for (Float Result : ExamResults) {
			TotalResult += Result;
		};
		return TotalResult / ExamsQuantity;
	};
}
