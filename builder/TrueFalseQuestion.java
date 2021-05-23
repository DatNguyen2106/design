package builder;

public class TrueFalseQuestion extends Question{
	private int answer;
	
	public TrueFalseQuestion(String content, double weight, int answer) {
		super(content, weight);
		this.answer = answer;
	}
	
	@Override
	public void display() {
		System.out.println(content+": ("+ weight+" points)");
		System.out.println("True\tFalse\t" + answer);

	}
	
	
}
