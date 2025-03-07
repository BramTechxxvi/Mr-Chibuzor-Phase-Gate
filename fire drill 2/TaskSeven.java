import java.util.Scanner;
public class TaskSeven {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		double sumOfScores = 0; int counter = 0; double averageOfScores = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores "+(count+1)+": ");		
	int scores = ogaCollector.nextInt();
		if (scores % 2 == 0) {
		sumOfScores+=scores;
		counter++;
		}
   	}
	averageOfScores = sumOfScores / counter;
	System.out.print("\nSum of even numbers in the scores collected are: " + sumOfScores);
	System.out.printf("%n%s%-2f", "Average of even numbers in the scores collected are: ", averageOfScores);
	}
}