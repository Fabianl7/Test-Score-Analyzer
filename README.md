# Test Score Analyzer

This Java program analyzes test scores entered by the user, providing a detailed report on the distribution of letter grades, the number of passing scores, and the average score. The user can input scores one by one, and the program stops when -1 is entered.

## Usage

1. **Compile the Program:**
   - Make sure you have Java installed on your system.
   - Open a terminal and navigate to the directory containing the `Main.java` file.
   - Compile the program using the following command:
     ```bash
     javac Main.java
     ```

2. **Run the Program:**
   - After compilation, run the program with the following command:
     ```bash
     java Main
     ```

3. **Enter Test Scores:**
   - Follow the prompt to enter test scores one by one.
   - Enter `-1` to stop entering scores.

4. **View Test Score Report:**
   - The program will display a comprehensive report, including the total number of scores, the number of passing scores, letter grade distribution, and the average score.

5. **Process Another Class (Optional):**
   - After viewing the report, the program will ask if you want to process another class.
   - Enter `Y` for Yes or `N` for No.

6. **Exit the Program:**
   - The program will say goodbye, and you can exit.

## Example

```bash
Welcome to my program. You will be asked to enter the scores of a test one by one, and to enter -1 to stop

Enter Score (Enter -1 to Stop): 85
Enter Score (Enter -1 to Stop): 92
Enter Score (Enter -1 to Stop): 78
Enter Score (Enter -1 to Stop): 60
Enter Score (Enter -1 to Stop): -1

Here is your report:
	- A total of 4 scores entered. 3 of them are 70 or higher.

	- Letter Grade distribution of the scores:
		- 1 Students earned the grade of A (90-100)
		- 1 Students earned the grade of B (80-89)
		- 1 Students earned the grade of C (70-79)
		- 1 Students earned the grade of D (60-69)
		- 0 Students earned the grade of F (59 or below)

		- The average score is: 78.75

Would you like to process another class? (Y or N): n
Goodbye!
