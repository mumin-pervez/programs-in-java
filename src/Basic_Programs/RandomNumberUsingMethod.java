/* A program to find the random number between a range by Mumin Pervez*/
package Basic_Programs;

public class RandomNumberUsingMethod {

  public static void main(String[] args) {
    int min = 100;
    int max = 5000;
    System.out.println("Random Number between " + min + " to " + max + ":");
    int r = (int) (Math.random() * (max - min + 1) + min);
    System.out.println("Random number is : "+r);
  }
}
