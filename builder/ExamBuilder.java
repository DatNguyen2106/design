package builder;

import java.util.ArrayList;

public class ExamBuilder {
	private ArrayList<Question> questionList = new ArrayList<Question>();
	public Exam prepareExam() {
		return new Exam(questionList);
	}
	
	public ExamBuilder addTrueFalseQuestion(String content, double weight, int answer) {
		questionList.add(new TrueFalseQuestion(content, weight, answer));
		return this;
	}
	
	public ExamBuilder addMultipleChoiceQuestion(String content, double weight, ArrayList<String> option, int answer) {
		questionList.add(new MultipleChoiceQuestion(content, weight, option, answer));
		return this;
	}
	
	public ExamBuilder addMultipleResponseQuestion(String content,double weight, ArrayList<String> answer, ArrayList<String> point) {
		questionList.add(new MultipleResponseQuestion(content, weight , answer, point));
		return this;
	}
}
