/* A program to find the reverse number given by user using while loop by Mumin Pervez*/
package Numbers_Programs;

import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter your number : ");
    int number = scanner.nextInt();

    int temp = number;
    int reverseNumber = 0;

    while (number != 0) {
      int reminder = number % 10;
      reverseNumber = (reverseNumber * 10) + reminder;
      number = number / 10;
    }

    System.out.println("The reverse number of " + temp + " is : " + reverseNumber);
  }

}
