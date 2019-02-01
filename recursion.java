import java.util.*;

public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n == 0) return 0;
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
      return fibHelper(n,0,1);
    }

    //tail recursion helper method for fib
    public static int fibHelper(int n, int x, int y){
      if (n == 0) return 0;
      if (n == 1) return y;
      return fibHelper(n - 1, y, y+x);
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> sum = new ArrayList<Integer>();
      sumHelper(n, 0, sum);
      return sum;
    }

    public static void sumHelper(int n, int currentSum, ArrayList<Integer> sum){
      if (n == 0) sum.add(currentSum);
      else{
        sumHelper(n - 1, currentSum, sum);
        sumHelper(n - 1, currentSum + n, sum);
      }
    }

    public static void main(String[] args) {

      System.out.println("Testing sqrt function\n");
      System.out.println(sqrt(100,.001)); //return 10
      System.out.println(sqrt(10,.001)); //return 3.162
      System.out.println(sqrt(2,.001)); //return 1.414
      System.out.println(sqrt(35,.001)); //return 5.92
      System.out.println(sqrt(36,.001)); //return 6
      System.out.println(sqrt(4.5,.001)); //return 2.121
      System.out.println(sqrt(0,.001)); //return 0

      System.out.println("--------------------------------");

      System.out.println("Testing fib function\n");
      System.out.println(fib(0)); //return 0
      System.out.println(fib(1)); //return 1
      System.out.println(fib(2)); //return 1
      System.out.println(fib(3)); //return 2
      System.out.println(fib(4)); //return 3
      System.out.println(fib(5)); //return 5
      System.out.println(fib(6)); //return 8
      System.out.println(fib(10)); //return 55
      System.out.println(fib(25)); //return 75025

      System.out.println("--------------------------------");



    }

}
