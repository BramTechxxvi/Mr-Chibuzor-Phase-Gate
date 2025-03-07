import java.util.Scanner;
public class TaskTwo {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		double sumOfScores = 0; double averageOfScores = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores: ");
	int scores = ogaCollector.nextInt();
		sumOfScores+=scores;
   	}
	averageOfScores = sumOfScores / 10;
	System.out.print("Average of scores collected is: " + averageOfScores);
	}
}