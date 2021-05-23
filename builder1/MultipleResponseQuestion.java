package builder;

import java.util.ArrayList;

public class MultipleResponseQuestion extends Question{
	private ArrayList<String> option;
	private ArrayList<String> answer;
	
	public MultipleResponseQuestion(String content, double weight, ArrayList<String> option, ArrayList<String> answer) {
		super(content, weight);
		this.answer = answer;
		this.option = option;
	}
	
	@Override
	public void display() {
		System.out.println(content+": ("+ weight +" points)");
		for (int i=0; i<option.size(); i++) {
			System.out.print(option.get(i)+"\t");
		}
		for (int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i)+"\t");
		}
		System.out.println();
	}
	
}
