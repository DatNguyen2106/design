package builder;

import java.util.ArrayList;

public class Exam {
	private ArrayList<Question> questionList = new ArrayList<Question>();
	
	public Exam(ArrayList<Question> questionList) {
		this.questionList = questionList;
	}
	
	public void display() {
		for (int i=0; i<questionList.size(); i++) {
			questionList.get(i).display();
		}
	}
}
