package collatz.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataStorage implements DsInterface {

    public boolean isCsvFile(String userInput){
        return false;
    }

    public int[] readFirstRowAsIntegers(String csvFilePath) {
        List<Integer> integers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line = reader.readLine(); // Read the first line
            if (line != null) {
                String[] parts = line.split(","); // Split the line by commas
                for (String part : parts) {
                    integers.add(Integer.parseInt(part)); // Convert each part to an integer
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException appropriately
        } catch (NumberFormatException e) {
            e.printStackTrace();
            // Handle the NumberFormatException if the file contains non-integer values
        }

        // Convert the list of integers to an array
        int[] result = new int[integers.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integers.get(i);
        }

        return result;
    }
    
    public boolean isIntDoubleArray(Object userInput){
        return false;
    }
    
    public void writeDoubleArrToCsv(int[][] array, String filename){
         try (FileWriter writer = new FileWriter(filename)) {
          for (int i = 0; i < array.length; i++) {
              for (int j = 0; j < array[i].length; j++) {
                  writer.append(String.valueOf(array[i][j]));
                  if (j < array[i].length - 1) {
                      writer.append(',');
                  }
              }
              writer.append('\n');
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

    
}

