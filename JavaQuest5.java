package questions;

public class JavaQuest5 {
  /**
   * 
   * When target = 'c', the expected output:
   * We found 3 character c in the String.
   * 
   * When target = 'z', the expected output:
   * Not Found.
   */
  // Count the target of character in a String.
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here ...
    int total = str.length();
    //System.out.println(total);
    int sum = 0;
    for (int i=0; i<total; i++){
      if (str.charAt(i)==target){
        sum+=1;
      }
    }
    //System.out.println(sum);


    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here ...
    if (sum>0){
      System.out.println("We found "+sum+" character "+ target +" in the String");
    }else{
      System.out.println("Not Found");
    }


  }
}