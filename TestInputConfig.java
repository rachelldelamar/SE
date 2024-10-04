package test;
import java.util.ArrayList;
import java.util.List;
import collatz.src.InputConfig;

public class TestInputConfig implements InputConfig {

    private List<Integer> inputData;

    public TestInputConfig() {
        inputData = new ArrayList<>();
    }

    @Override
    public void setInputData(List<Integer> data) {
        inputData = data;
    }

    @Override
    public List<Integer> getInputData() {
        return inputData;
    }

    @Override
    public void setInputData(int[] inputData) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setInputData'");
    }
}
