public class TaskSeven {

	public static void main(String... args) {
		int firstNumber = 4; int secondNumber = 8; 
		int firstResult = 1; int secondResult = 1; 
		int firstAnswer = 0; int secondAnswer = 0;

	for (int count = 0; count < 5; count++) {
		firstResult *= firstNumber;
		firstAnswer+=firstResult;
	}
		System.out.println(firstAnswer);

	for (int count = 0; count < 5; count++) {
		secondResult *= secondNumber;
		secondAnswer+=secondResult;
	}	
		System.out.println(secondAnswer);

	}

}
