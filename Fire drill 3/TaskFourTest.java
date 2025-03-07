import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TaskFourTest {

	TaskFour myOperator = new TaskFour();

	@Test
	pubiic void testThatFunctionCanReturnElementsInEvenIndex() {
		int[] testInput = {23, 5, 8, 12, 10, 4, 20};
		actual = muOperator.taskFour(testInput);
		int []result = {23, 8, 10, 20};
	assertEquals(actual, result);
}
}