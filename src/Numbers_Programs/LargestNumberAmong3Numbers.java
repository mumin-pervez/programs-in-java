/* A program to find the largest number among 3 given by user using while loop by Mumin Pervez*/
package Numbers_Programs;

import java.util.Scanner;

public class LargestNumberAmong3Numbers {

  public static void main(String[] args) {
    System.out.print("Please enter the first number : ");
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    System.out.print("Please enter the first number : ");
    int secondNum = scanner.nextInt();
    System.out.print("Please enter the first number : ");
    int thirdNum = scanner.nextInt();

    if (firstNum > secondNum) {
      if (firstNum > thirdNum) {
        System.out.println("The largest number is : " + firstNum);
      } else {
        System.out.println("The largest number is : " + thirdNum);
      }
    } else {
      if (secondNum > thirdNum) {
        System.out.println("The largest number is : " + secondNum);
      } else {
        System.out.println("The largest number is : " + thirdNum);
      }
    }
  }

}
