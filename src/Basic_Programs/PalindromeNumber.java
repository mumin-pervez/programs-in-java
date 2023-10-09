/* A program to check the given number is Palindrome or not by Mumin Pervez*/
// Output :  455 Palindrome
package Basic_Programs;

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
    int inputNumber, temp, reminder, sum = 0;
    System.out.print("Enter your number : ");
    Scanner scanner = new Scanner(System.in);
    inputNumber = scanner.nextInt();
    temp = inputNumber;
    while (inputNumber > 0) {
      reminder = inputNumber % 10;
      sum = (sum * 10) + reminder;
      inputNumber = inputNumber / 10;
    }
    if (temp == sum) {
      System.out.println(sum + " Number is Palindrome");
    } else {
      System.out.println(sum + " Number is NOT Palindrome");
    }
  }
}
