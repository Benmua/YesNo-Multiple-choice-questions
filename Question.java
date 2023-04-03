import java.awt.*;
import javax.swing.*;

public abstract class Question {
	static int nQuestions =0;
	static int nCorrect =0;
	QuestionDialog question; // created a variable to store the question received from string query.
	String correctAnswer;
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+"",JLabel.CENTER));
		
	}
	String ask() { // Here is the method ASK.
		
		question.setVisible(true);
		return question.answer;
		}
	void check() { // Here is the method Check.
			nQuestions++;
			String answer = ask();
			if (answer.equals(correctAnswer)) {
			 JOptionPane.showMessageDialog(null,  "You are correct");	
			 nCorrect++;
			} else {
				JOptionPane.showMessageDialog(null, "You are incorrect. The correct answer is "+ correctAnswer+".");
		 //End of if else statement.			 
		 }//This method checks the answer to the question.
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
		
}
	static void showResults() { // Here is the method showResults
	JOptionPane.showMessageDialog(null, "You got " + nCorrect + " correct"
			+ " answers out of " + nQuestions + " questions");
}
} // end of class MultipleChoiceQuestion


