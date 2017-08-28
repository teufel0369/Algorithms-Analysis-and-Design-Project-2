import static java.lang.System.out;
import java.math.BigInteger;
import java.util.*;

public class memo {

    private static Map<Integer, BigInteger> memoization = new HashMap<>();

    public static void main(String[] args){
        int index = 0;

        if(args.length == 0){ //if there are no command line arguments
            out.println("[-]ERROR: You must include an index to compute from");
        }
        else{
            index = Integer.parseInt(args[0]); //cast the string to an primitive integer data type
        }

        long startTime = System.currentTimeMillis(); //start the clock
        out.println("\n\nThe Fibonacci number at index " + index + " is: " + memoizationFib(index));
        long endTime = System.currentTimeMillis(); //stop the clock

        float totalTime = (float)(endTime - startTime);

        totalTime = totalTime / 1000; //convert the time to seconds

        out.println("\nMemoization runtime: " + totalTime + " seconds\n");
    }

    private static BigInteger memoizationFib(int index){
        if(index == 0 || index == 1){ //base case
            return BigInteger.valueOf(index); //return the value of 0 or 1
        }
        else if(memoization.containsKey(index)){ //if the map contains the key of index
            return memoization.get(index); //get the key and return it
        }
        else{ //otherwise, do the calculation, add it to the tree and return it
            BigInteger mem = memoizationFib(index-2).add(memoizationFib(index-1));
            memoization.put(index, mem);
            return mem;
        }
    }
}
