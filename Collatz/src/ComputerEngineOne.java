package collatz.src;
public class ComputerEngineOne implements CEOneInterface {

    private static final ConceptualAPIInterface TEST = null;
    //creating networkAPI object that has access to the user object
    NetworkAPI user = new NetworkAPI();
    String pathOfCsv = user.getInputPath(); 
    String pathOfOutCsv = user.getOutputPath();
    //creating datastorage object to gain access to its methods
    ProcessAPI ds = new ProcessAPI();
    //passing path to process api to send it datastorage
    //getting int[] array back
    int[] inputArray = ds.getInputArr(pathOfCsv);

    // creating ConceptualAPI object to do connect to ceTwo 
    // sending int[] for computation to gain matrix output
    ConceptualAPI csTwo = new ConceptualAPI(TEST);
    int[][] outputMatrix = csTwo.computedIntDoubleArr(inputArray);

    //converting Matrix to csv
    /*ds.writeDoubleArrToCsv(outputMatrix, pathOfOutCsv);*/

    public boolean userInputRequest(String path){
        return false;
    }
    public boolean csvConvertedIntoIntarr(){
        return false;
    }
    public boolean intArrToDoubleArr(){
        return false; 
    }
    public boolean intArrDoubleToCsv(){
        return false; 
    }
    public boolean csvBackToUser(){
        return false;
    }
    
}
