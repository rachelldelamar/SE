package collatz.src;
public class User implements UserInterface{
    public String inputPath;
    public String outputPath;
    public char delimeter;

    public User(){
        inputPath = "path";
        outputPath = "path";
        delimeter = ',';
    }

    String getInputPath(){
        return inputPath;
    }

    @Override
    public InputConfig getInputConfig() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInputConfig'");
    }

    @Override
    public OutputConfig getOutputConfig() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOutputConfig'");
    }

    @Override
    public char getDelimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDelimeter'");
    }

} 