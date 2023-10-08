/* A program to show the Fibonacci Series by Mumin Pervez*/
// Output :  0 1 1 2 3 5 8 13 ...
package Basic_Programs;

import java.util.Scanner;

public class FibonacciSeries {

  public static void main(String[] args) {
    int n1 = 0, n2 = 1, n3 = 0;
    System.out.print("Enter your number : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.print("Fibonacci Series : " + n1 + " " + n2);
    for (int i = 1; i < num; i++) {
      n3 = n1 + n2;
      System.out.print(" " + n3 + "");
      n1 = n2;
      n2 = n3;
    }
    System.out.println("");
  }
}
