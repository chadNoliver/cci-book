
package types;
public class Question implements QInterface{
	int question_no;
	String question_prompt;
	Chapter chapter;
	public Answer answer;
	
	public void run() {
		System.out.println(this);
		answer.call();
	}

	public Question(Chapter chapter, int question_no, String question_prompt){
		this.chapter = chapter;
		this.question_no = question_no;
		this.question_prompt = question_prompt;
		
	}
	@Override
	public String toString() {
		return chapter.toString()+ "\n" + "Question: " + String.valueOf(question_no)+": "+question_prompt;
	}

}
