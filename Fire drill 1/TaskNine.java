public class TaskNine {

	public static void main(String... args) {
		int firstNumber = 4; int secondNumber = 8; 
		int firstResult = 1; int secondResult = 1; 
		int firstAnswer = 0; int secondAnswer = 0;
		int total = 0; int square = 0;

	for (int count = 0; count < 5; count++) {
		firstResult *= firstNumber;
		firstAnswer+=firstResult;
	}
	for (int count = 0; count < 5; count++) {
		secondResult *= secondNumber;
		secondAnswer+=secondResult;
	}	
		total = firstAnswer + secondAnswer;
		square = total * total;
		System.out.println(square);


	}

}
