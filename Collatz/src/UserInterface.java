package collatz.src;
public interface UserInterface {
    //creating methods to check the user input. check that a csv was inputted correctly with only 1 row.
    //creating method to check if user output is correct, it gotta be a csv file with 2 rows.
    //delimeter is gonna be ,
    InputConfig getInputConfig();
    OutputConfig getOutputConfig();
    char getDelimeter();
}
