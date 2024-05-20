package src.questions;

public class JavaQuest6 {
  /**
   * Expected output:
   * 1 1 2 3 5 8 13 21 ...
   * 
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    // Code here ...
    // for loop to print first 15 numbers in Fibonacci Sequence
    //fibo2=fibo0+fibo1
    //fibo3=fibo1+fibo2
    //fibo4=fibo2+fibo3

    int[] fibo = new int[17];
    fibo[0]=1;
    fibo[1]=1;
    System.out.println(fibo.length);
    for (int i=0;i<15;i++){
      fibo[i+2]= fibo[i+1]+fibo[i];
      System.out.println(fibo[i]);
    }
    //System.out.println(size);
  }
}