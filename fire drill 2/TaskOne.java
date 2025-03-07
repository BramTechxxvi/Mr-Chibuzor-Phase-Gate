import java.util.Scanner;
public class TaskOne {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		int sumOfScores = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores: ");
	int scores = ogaCollector.nextInt();
		sumOfScores+=scores;
   	}
	System.out.print("\nTotal of scores collected is: " + sumOfScores);
	}
}