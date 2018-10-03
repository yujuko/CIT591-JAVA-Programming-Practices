
//  A palindrome is a word or sequence of characters that is spelled the same way backwards and forwards. For example, "Otto" is a palindrome because reversed it still spells "ottO". Modify your StringBuilder object to be a palindrome. (It must be at least 4 characters long, but there is no limit to how long it can be.) Print this palindrome.

---------------------------------------------------------------------------------------------------

package HW1Lucy;

/**
 * A class that can record a student's name, scores and generate the student's average score.
 * @author lucykuo
 *
 */

public class studentAndScore {
		
		private String studentName;
		private int studentScore;
		private int numberOfQuizzes;
		
		/**Constructs a student profile with one score.      
		 * @param name student's name
		 * @param score student's first score   
		 */
		
		studentAndScore(String name, int score){
			studentName = name;
			studentScore = score;
			numberOfQuizzes = 1;
		}	
		
		/**Constructs a student profile with a total score.      
		 * @param name student's name
		 * @param totalScore student's first score
		 * @param number amount of quizzes that the student had
		 */
		
		studentAndScore(String name, int totalScore, int number){
			studentName = name;
			studentScore = totalScore;
			numberOfQuizzes = number;
		}
			
		/**
		 * Get the student's name
		 * @return The student's name
		 */
		public String getName() {
			return studentName;
		}
		
		/**
		 * Add a score to the student's record.
		 * @param score The score to be recorded.
		 */
		public void addQuiz(int score) {
			studentScore += score;
			numberOfQuizzes += 1;
		}
		
		/**
		 * Get the student's total score.
		 * @return The total score of the student.
		 */
		public int getTotalScore() {
			return studentScore;
		}
		
		/**
		 * Get the student's average score.
		 * @return The average score of the student.
		 */
		public double getAverageScore() {
			return (double)studentScore / numberOfQuizzes;
		}
			
	

	}

