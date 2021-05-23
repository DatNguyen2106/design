package builder;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question{
	private String answer;
	private ArrayList<String> answerList;

	public TrueFalseQuestion(String content, double weight, String answer) {
		super(content, weight);
		this.answer = answer;
	}
	
	@Override
	public void display() {
		System.out.println(content+": ("+ weight+" points)");
		System.out.println("True\tFalse\t" + answer);
	}
	
	
}
