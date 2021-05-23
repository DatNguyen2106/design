package builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		ExamBuilder builder = new ExamBuilder();
		Exam exam = builder.addTrueFalseQuestion("What is True/False Question?", 4.0, 1)
					.addMultipleChoiceQuestion("Age?", 5.0, new ArrayList<>(Arrays. asList("A", "B", "C")), 1)
					.addMultipleResponseQuestion("Place?", 10.0, new ArrayList<>(Arrays. asList("A", "B", "C")), new ArrayList<>(Arrays. asList("B", "C")))
					.prepareExam();
		exam.display();
		
	}
}
