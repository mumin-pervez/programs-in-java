/* A program to Check Prime Number using a for loop by Mumin Pervez*/
package Basic_Programs;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    int i, count = 0;
    System.out.print("Enter your number : ");
    Scanner obj = new Scanner(System.in);
    int num = obj.nextInt();

    for (i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }

    if (count == 2) {
      System.out.println(num + " is Prime Number");
    } else {
      System.out.println(num + " is not Prime Number");
    }
  }
}