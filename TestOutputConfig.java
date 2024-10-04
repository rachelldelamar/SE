package test;
import java.util.ArrayList;
import java.util.List;
import collatz.src.OutputConfig;

public class TestOutputConfig implements OutputConfig {

    private List<String> outputData;

    public TestOutputConfig() {
        outputData = new ArrayList<>();
    }

    @Override
    public void writeOutput(String data) {
        outputData.add(data);
    }

    public List<String> getOutputData() {
        return outputData;
    }
}
