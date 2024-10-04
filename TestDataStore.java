package test;
import java.util.List;
import collatz.src.DsInterface;
import collatz.src.InputConfig;
import collatz.src.OutputConfig;

public class TestDataStore implements DsInterface {

    private InputConfig inputConfig;
    private OutputConfig outputConfig;

    public TestDataStore(InputConfig inputConfig, OutputConfig outputConfig) {
        this.inputConfig = inputConfig;
        this.outputConfig = outputConfig;
    }


    @Override
    public boolean isCsvFile(String userInput) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isCsvFile'");
    }

    @Override
    public int[] readFirstRowAsIntegers(String csvFilePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readFirstRowAsIntegers'");
    }

    @Override
    public boolean isIntDoubleArray(Object userInput) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isIntDoubleArray'");
    }

    @Override
    public void writeDoubleArrToCsv(int[][] arr, String csvFilePath) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDoubleArrToCsv'");
    }

  
}