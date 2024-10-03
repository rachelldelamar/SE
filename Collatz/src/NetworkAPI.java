package collatz.src;
public class NetworkAPI implements NetworkAPIInterface {
    User user = new User();

    public String getInputPath(){
        return user.inputPath;
    }

    public char getDelimeter(User delimeter){
        return ',';
    }
    public String getOutputPath(){
        return user.outputPath;
    }
    
}
