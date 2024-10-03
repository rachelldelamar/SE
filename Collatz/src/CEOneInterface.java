package collatz.src;
public interface CEOneInterface {
//  method to check Program process is everything working as its supposed
    //  was user input recesived by DS
    boolean userInputRequest(String path);
    //  Was user input converted into int[] arr
    boolean csvConvertedIntoIntarr();
    // was the int[] arr coverted into double int[][] in CE2 after computation
    boolean intArrToDoubleArr();
    //  was the output from CE2 converted into csv for output type
    boolean intArrDoubleToCsv();
    // was the computed output csv returned to the user
    boolean csvBackToUser();
    
}    