package collatz.src;

public interface DsInterface {
    // method will take in csvpath and convert csv into int[] to be work on in CE
    boolean isCsvFile(String userInput);
    int[] readFirstRowAsIntegers(String csvFilePath);
    
    // after compuation is done We have to convert output that will be an int[][] back into a csv for output
    boolean isIntDoubleArray(Object userInput);
    void writeDoubleArrToCsv(int[][] array, String filename);
}
