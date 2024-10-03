package collatz.src;
public class ConceptualAPI implements ConceptualAPIInterface {
    //creating an csTwo object, ce will only have access to the csTwo object via the conceptual api only
    ComputerEngineTwo csTwo = new ComputerEngineTwo();


    public ConceptualAPI(ConceptualAPIInterface mockAPI) {
        //TODO Auto-generated constructor stub
    }


    public int[][] computedIntDoubleArr(int[] inputArray){
        int[][] outputMatrix = csTwo.computeCollatzSequences(inputArray);
        return outputMatrix;
    }

   
}
