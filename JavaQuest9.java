package questions;

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    String target1 = "J";
    if (str.contains(target1)==true){
      System.out.println(str.charAt(str.indexOf(target1)));
    }else{
      System.out.println("It does not contains "+target1);
    }

    String target2 = "e";
    if (str.indexOf(target2) != -1){
      System.out.println(str.charAt(str.indexOf(target2)));
    }else{
      System.out.println("It does not contains "+ target2);
    }



    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());


    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    //String str = "VenturenixLAB, Java";
    String str2= str.replace("Coding","Java");
    System.out.println(str.replace("Coding","Java"));


    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5,8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str2.toUpperCase());
    System.out.println(str2.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str2.toUpperCase().replace("E","*").concat("!!!"));

  }
}