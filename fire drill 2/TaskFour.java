// collect 10 scores and print sum of the even indexes
import java.util.Scanner;
public class TaskFour {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
		int sumEvenIndex = 0; int num = 0;
	for (int count = 0; count < 10; count++) {
	System.out.print("Enter Scores "+(count+1)+": ");	
		int scores = ogaCollector.nextInt();
		if (count % 2 == 0) {
		sumEvenIndex+=scores;
		}
   	}
	System.out.print("\nTotal of scores of even index is: " + sumEvenIndex);
	System.out.print(num);

	}
}