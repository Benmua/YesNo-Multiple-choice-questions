// This is the QUIZ FILE
public class Quiz {	
	
	public static void main(String[] args) {
		
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
				" Who will ask you the first question?", " One Question",
				" Two Question", " Three Question", 
				" Four Question", " Five Question", "a");
		question1.check();
		
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"How Many Senses have you?", "One",
				"Two", "Three", 
				"Four", "Five", "e");
		question2.check();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"When was your last birthday celebrated?", 
				"One day ago", "Two days ago", "Three days ago", 
				"Four days ago", "Five days ago", "a");
		question3.check();
		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"Who founded Christianity?", "Mohammed Ali",
				"Joseph The Baptis", "Jesus Christ", 
				"The Maggi", "Apostle Paul", "c");
		question4.check();
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"What is the first meal of the day called?", 
				"Breakfast", "Supper", "Lunch", 
				"Dinner", "None of the above", "a");
		question5.check();
		
		Question TrueOrFalseQuestion1 = new TrueFalseQuestion("Islam"
				+ " is a religion?", "y");
		TrueOrFalseQuestion1.check();
		
		Question TrueOrFalseQuestion2 = new TrueFalseQuestion("The"
				+ " moon governs the night?", "y");
		TrueOrFalseQuestion2.check();
		
		Question TrueOrFalseQuestion3 = new TrueFalseQuestion("We "
				+ "usually take breakfast at dusk?", "n");
		TrueOrFalseQuestion3.check();
		
		Question TrueOrFalseQuestion4 = new TrueFalseQuestion("It was "
				+ "an African who first landed in the moon", "n");
		TrueOrFalseQuestion4.check();
		
		Question TrueOrFalseQuestion5 = new TrueFalseQuestion("The "
				+ "sun governs the day?", "y");
		TrueOrFalseQuestion5.check();
		
		
		
		Question TrueOrFalseQuestion6 = new TrueFalseQuestion("The "
				+ "sun rises in the south?", "n");
		TrueOrFalseQuestion6.check();
		
		TrueFalseQuestion.showResults();
		}
}
