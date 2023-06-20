package TestingSystem_Assignment_01;

public class Answer {
	int id;
	String content;
	Question questionID;
	boolean isCorrect;

	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", questionID=" + questionID + ", isCorrect=" + isCorrect
				+ "]";
	}

}