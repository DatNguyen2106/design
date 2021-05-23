package builder;

abstract class Question{
	protected String content;
	protected double weight;
	
	public Question(String content, double weight) {
		this.content = content;
		this.weight = weight;
	}
	public void check() {}

	public void display() {}
}
