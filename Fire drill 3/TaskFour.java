import java.util.Arrays;
public class TaskFour {

	public int[] taskFour(int[] userInput) {
		int[] array = {1, 2, 3, 4, 5, 6, 7}; int num = 0;
	for (int count = 0; count < array.length; count++) {
		
		if (array[count] % 2 == 0) 
		num = array[count];
	}
		return new int[]{num};
}
/*
	public int[] taskFive(int[] userInput) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
	for (int count = 0; count < array.length; count++) {
		if (array[count] % 2 == 0) 
		num = array[count];
	}
		return num;
}

*/





	public static void main(String... args) {
	TaskFour myMethod = new TaskFour();
		int[] array = {10, 11, 56, 3, 90, 65, 4};
		int[] newArray = myMethod.taskFour(array);
		System.out.println(Arrays.toString(newArray));
	}
}