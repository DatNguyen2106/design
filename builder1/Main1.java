package builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		ExamBuilder builder = new ExamBuilder();
		Exam exam = builder.addTrueFalseQuestion("What is True/False Question?", 4.0, "True")
					.addMultipleChoiceQuestion("Age?", 5.0, new ArrayList<>(Arrays. asList("A", "B", "C")), "B")
					.addMultipleResponseQuestion("Place?", 10.0, new ArrayList<>(Arrays. asList("A", "B", "C")), new ArrayList<>(Arrays. asList("B", "C")))
					.prepareExam();
		exam.display();
		ArrayList<String> QuestionAnswered = new ArrayList();
		for (int i = 0; i < exam.size(); i++) {
		Scanner input = new Scanner(System.in);
		int j = i + 1;
		System.out.print("Answer " + j + ": " );
		String answer1 = input.nextLine();
		QuestionAnswered.add(answer1);
		}

		System.out.println(QuestionAnswered);
	}

	private static boolean check(String answer1) {
		// TODO Auto-generated method stub
		return false;
	}

}
