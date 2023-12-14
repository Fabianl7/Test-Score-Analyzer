import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int scoreInput = 0, numScores = 0,  passingScores = 0, totalScore = 0;
		int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
		String stringInput = "y";
		Scanner intInput = new Scanner(System.in);
		Scanner strInput = new Scanner(System.in);
		
		System.out.println("Welcome to my program. You will be asked to enter the scores of a test one by one, "
				+ "and to enter -1 to stop");
		
		// Loop that asks the user if he wants to process another class
		while( stringInput.equals("y") ) {
			System.out.println("");
			
			// Asks the user to input different scores until -1 is written
			while(scoreInput != -1) {
				System.out.print("Enter Score (Enter -1 to Stop): ");
				scoreInput = intInput.nextInt();
				
				// Checks if the written score if valid (0 - 100)
				if(scoreInput > 100 || scoreInput < -1) 
					System.out.println("Score " + scoreInput + " Rejected");
				// Makes sure -1 is not used to update the variables
				else if(scoreInput != -1) {
					numScores++;
					if(scoreInput >= 70) passingScores++;
					totalScore+=scoreInput;
					
					if(scoreInput > 100) System.out.println("Score " + scoreInput + " Rejected");
					else if(scoreInput >= 90) gradeA++;
					else if(scoreInput >= 80) gradeB++;
					else if(scoreInput >= 70) gradeC++;
					else if(scoreInput >= 60) gradeD++;
					else if(scoreInput >= 0) gradeF++;
				}
			}
			scoreInput = 0;
			
			System.out.println("\nHere is your report: ");
			System.out.println("\t- A total of " + numScores + 
					" scores entered. " + passingScores + " of them are 70 or higher.\n");
			
			System.out.println("\t- Letter Grade distribution of the scores: ");
			System.out.println("\t\t- " + gradeA + " Students earned the grade of A (90-100)");
			System.out.println("\t\t- " + gradeB + " Students earned the grade of B (80-89)");
			System.out.println("\t\t- " + gradeC + " Students earned the grade of C (70-79)");
			System.out.println("\t\t- " + gradeD + " Students earned the grade of D (60-69)");
			System.out.println("\t\t- " + gradeF + " Students earned the grade of F (59 or below)\n");
			
			System.out.printf("\t\t- The average score is: %.2f\n", (double) totalScore/numScores);
			
			System.out.print("\nWould you like to process another class? (Y or N): ");
			stringInput = strInput.nextLine();
			stringInput = stringInput.toLowerCase();
		}
		
		System.out.print("Goodbye!");
	}

}
