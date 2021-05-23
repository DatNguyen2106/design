package builder;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoiceQuestion extends Question{
	private ArrayList<String> option;
	public ArrayList<String> answerList;
	private String answer;
	
	public MultipleChoiceQuestion(String content, double weight, ArrayList<String> option, String answer) {
		super(content, weight);
		this.option = option;
		this.answer = answer;
	}
	
	@Override
	public void display() {
		System.out.println(content+": ("+ weight +" points)");
		for (int i=0; i<option.size(); i++) {
			System.out.print(option.get(i)+"\t");
		}
		System.out.print(answer);
		System.out.println();
	}
	
}
