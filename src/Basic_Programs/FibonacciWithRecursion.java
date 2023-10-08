/* A program to show the Fibonacci Series using Recursion by Mumin Pervez*/
// Output :  0 1 1 2 3 5 8 13 ...
package Basic_Programs;

import java.util.Scanner;

public class FibonacciWithRecursion {

  static int n1 = 0, n2 = 1, n3;

  void addNumbers(int num) {
    if (num > 1) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.out.print(" " + n3);
      addNumbers(num - 1);
    }
  }

  public static void main(String[] args) {
    FibonacciWithRecursion obj = new FibonacciWithRecursion();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num = scanner.nextInt();
    System.out.print("Fibonacci Series : " + n1 + " " + n2);
    obj.addNumbers(num);
  }

}
