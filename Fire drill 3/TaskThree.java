import java.util.Arrays;
import java.util.Scanner;
public class TaskThree {

	public static void main(String... args) {
	Scanner ogaCollector = new Scanner (System.in);
	int[] array = new int[10];
	for (int count = 0; count < 10; count++) {
		System.out.print("Enter scores: ");
		int scores = ogaCollector.nextInt();
		array[count] = scores;
	}
	System.out.println(Arrays.toString(array));

}
}