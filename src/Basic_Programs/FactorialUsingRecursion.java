/* A program to find the Factorial numbers using Recursion by Mumin Pervez*/
// Output :  Factorial of 5 = 120 (5! = 5*4*3*2*1)
package Basic_Programs;

import java.util.Scanner;

public class FactorialUsingRecursion {

  static int factorialMaker(int num) {
    if (num == 0 || num == 1) {
      return 1;
    } else {
      return (num * factorialMaker(num - 1));
    }
  }

  public static void main(String[] args) {
    System.out.print("Please enter your number : ");
    Scanner scanner = new Scanner(System.in);
    int inputNum = scanner.nextInt();

    int fact = factorialMaker(inputNum);
    System.out.println("Factorial of " + inputNum + " is : " + fact);

  }

}
