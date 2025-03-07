import java.util.Scanner;
public class TaskFive {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		int sumOfScores = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores "+(count+1)+": ");		
	int scores = ogaCollector.nextInt();
		if (scores % 2 == 0) sumOfScores+=scores;
   	}
	System.out.print("\nSum of even numbers in the scores collected are: " + sumOfScores);
	}
}