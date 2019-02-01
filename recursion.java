import java.util.*;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrtHelper(n, tolerance, 1);
    }

    //helper function that uses guess as a parameter
    public static double sqrtHelper(double n, double tolerance, double guess){
      if (Math.abs((guess * guess - n)/n * 100) < tolerance) return guess;
      return sqrtHelper(n, tolerance, (n / guess + guess) / 2);
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(){
      ArrayList<Integer> sum = new ArrayList<Integer>();
      return sum;
    }

}
