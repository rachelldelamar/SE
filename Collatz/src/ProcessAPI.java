package collatz.src;
public class ProcessAPI implements ProcressAPIInterface {
    //creating ds object to gain access to data storage
    DataStorage ds = new DataStorage();
    
    public int[] getInputArr(String path){
        return ds.readFirstRowAsIntegers(path);
    }

    public void writeDoubleArrToCsv(int[][] array, String filename){
         ds.writeDoubleArrToCsv(array,filename);
    }
}
