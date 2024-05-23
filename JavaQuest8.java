package questions;
/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;

    // code here ...
    int[] target= nums; // choose the array
    int length=target.length;
    for (int i=0; i<length-1; i++){
      for (int j=0; j<length-i-1;j++){
        if (target[j]>target[j+1]){
          int temp=0;
          temp=target[j+1];
          target[j+1]=target[j];
          target[j]=temp;
        }
        
      }
    }

    secondMax=target[target.length-2];
    System.out.println(secondMax);





  }
}