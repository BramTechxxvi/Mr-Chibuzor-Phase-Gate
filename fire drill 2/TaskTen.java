import java.util.Scanner;
public class TaskTen {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		int scores = 0; double sumOfScores = 0; int counter = 0; double averageOfValid = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores "+(count+1)+": ");
		scores = ogaCollector.nextInt();
		if (scores > 0 && scores <= 100) {	
			sumOfScores+=scores;
			counter++;
   	}
	}
	averageOfValid = sumOfScores / counter;
	System.out.printf("%n%s%-2f", "Average of valid numbers in the scores collected are: ", averageOfValid);
	}
}