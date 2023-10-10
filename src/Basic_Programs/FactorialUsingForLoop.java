/* A program to find the Factorial numbers using For Loop by Mumin Pervez*/
// Output :  Factorial of 5 = 120 (5! = 5*4*3*2*1)

package Basic_Programs;

import java.util.Scanner;

public class FactorialUsingForLoop {

  public static void main(String[] args) {
    int inputNum, fact = 1;
    System.out.print("Please enter your number : ");
    Scanner scanner = new Scanner(System.in);
    inputNum = scanner.nextInt();

    for (int i = 1; i <= inputNum; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial of " + inputNum + " is : " + fact);
  }

}
