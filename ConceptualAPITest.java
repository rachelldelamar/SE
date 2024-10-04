package test;
import static org.mockito.Mockito.mock;
import org.junit.Test;

import collatz.src.ConceptualAPI;
import collatz.src.ConceptualAPIInterface;

public class ConceptualAPITest {

    @Test
    public void testComputedIntDoubleArr() {
        // Mock the dependencies
        ConceptualAPIInterface mockAPI = mock(ConceptualAPIInterface.class);
        // Create an instance of ConceptualAPI with the mocked dependencies
        ConceptualAPI api = new ConceptualAPI(mockAPI);

        // Define input for the method being tested
        int[] inputArray = {1, 2, 3};

        // Define expected output
        int[][] expectedOutput = {{0, 0}};

        // Call the method being tested
        int[][] actualOutput = api.computedIntDoubleArr(inputArray);


    }
}
