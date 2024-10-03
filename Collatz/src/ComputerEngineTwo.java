package collatz.src;
import java.util.ArrayList;

public class ComputerEngineTwo implements CETwoInterface {
    public int[][] computeCollatzSequences(int[] inputArray){
    int[][] result = new int[inputArray.length][];

    for (int i = 0; i < inputArray.length; i++) {
      int number = inputArray[i];
      ArrayList<Integer> sequence = new ArrayList<>();
      sequence.add(number); // Add the initial number to the sequence

      // Generate the Collatz sequence
      while (number != 1) {
        if (number % 2 == 0) {
          number /= 2;
        } else {
          number = 3 * number + 1;
        }
        sequence.add(number); // Add the next number in the sequence
      }

      // Convert ArrayList to int[]
      int[] sequenceArray = new int[sequence.size()];
      for (int j = 0; j < sequence.size(); j++) {
        sequenceArray[j] = sequence.get(j);
      }

      // Save the sequence in the result array
      result[i] = sequenceArray;
    }

    return result;
    }

}
