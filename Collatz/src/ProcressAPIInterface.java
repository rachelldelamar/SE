package collatz.src;
public interface ProcressAPIInterface {
   
    // sending int[] from ds to ce
    int[] getInputArr(String path);

    // sending int[][] from ce2 to ds to be converted into csv
    void writeDoubleArrToCsv(int[][] array, String filename);
    
  
}
