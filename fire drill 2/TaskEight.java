import java.util.Scanner;
public class TaskEight {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		int scores = 0; int sumOfScores = 0;
	for (int count = 0; count < 10; count++) {
	do {
	System.out.print("Enter Scores "+(count+1)+": ");
		scores = ogaCollector.nextInt();
		if (scores < 0 || scores > 100) {
	System.out.print("Enter valid score between 0-100\n");
		}}while(scores < 0 || scores > 100);	
		sumOfScores+=scores;
   	}
	System.out.print("\nSum of even numbers in the scores collected are: " + sumOfScores);
	}
}