import java.math.BigInteger;
import static java.lang.System.out;

public class nomemo {

    public static void main(String[] args){
        int index = 0;

        if(args.length == 0){ //if there are no command line arguments
            out.println("[-]ERROR: You must include an index to compute from");
        }
        else{
            index = Integer.parseInt(args[0]); //cast the string to an primitive integer data type
        }

        long startTime = System.currentTimeMillis(); //start the clock
        out.println("\n\nThe Fibonacci number at index " + index + " is: " + recursiveFib(index));
        long endTime = System.currentTimeMillis(); //stop the clock

        float totalTime = (float)(endTime - startTime);

        totalTime = totalTime / 1000; //convert the time to seconds

        out.println("\nRecursion runtime: " + totalTime + " seconds\n");

    }

    //recursive Fibonacci algorithm; I used BigInteger due to ArithmeticException from overflow
    private static BigInteger recursiveFib(int index){
        if(index == 0 || index == 1){ //base case
            return BigInteger.valueOf(index);
        }
        else { //Recursion and reduction calls
            return recursiveFib(index-2).add(recursiveFib(index-1));
        }
    }
}
