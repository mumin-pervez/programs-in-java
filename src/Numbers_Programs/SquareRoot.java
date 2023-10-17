/* A program to find out the square root number given by user using do-while loop by Mumin Pervez*/
package Numbers_Programs;

import java.util.Scanner;

public class SquareRoot {


  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println("The square root of " + num + " is : " + findSquareRoot(num));
  }

  public static double findSquareRoot(int number) {
    double temp;
    double squareRoot = number / 2;

    do {
      temp = squareRoot;
      squareRoot = (temp + (number / temp)) / 2;
    }
    while ((temp - squareRoot) != 0);
    return squareRoot;
  }
}
