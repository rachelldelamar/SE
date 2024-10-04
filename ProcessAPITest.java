package test;
import org.junit.Test;

import collatz.src.ProcessAPI;
public class ProcessAPITest {

    @Test
    public void testGetInputArr() {
        // Create an instance of ProcessAPI
        ProcessAPI api = new ProcessAPI();

        // Call the method being tested
        int[] inputArr = api.getInputArr("path");

       
    }

    @Test
    public void testGetOutput() {
        // Create an instance of ProcessAPI
        ProcessAPI api = new ProcessAPI();
        //output path 
        String  outputPath = "path";
        // Call the method being tested
        int[][] outputArr = {{0,0}};
        api.writeDoubleArrToCsv(outputArr,outputPath);
            
       
    }
}
