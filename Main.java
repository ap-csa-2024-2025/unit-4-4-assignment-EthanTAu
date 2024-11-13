import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //problem 1
   String buh = "Peter Piper picked a pack of pickle peppers."; //I still need to lower case it
   String sentence = buh.toLowerCase();
   int count = 0;
   for (int i = 0; i < sentence.length()-1; i++) {
    String pair = sentence.substring(i, i+2);
    if (pair.equals("pa") || pair.equals("pe") || pair.equals("pi") || pair.equals("po") || pair.equals("pu")) {
      count++;
    }
   }
   System.out.println("p is follwed by a vowel appears " + count + " times.");


   //problem 2
   String star = "Peter Piper picked a pack of pickle peppers."; 
   String word = star.toLowerCase();
   String replaced = "";
   for (int i = 0; i < word.length(); i++) {
    String yeah = word.substring(i, i + 1);
    if (yeah.equals("e") || yeah.equals("t") || yeah.equals("a") || yeah.equals("i") || yeah.equals("o")) {
  
    } else {
      replaced += yeah;
    }
   }
   System.out.println(replaced);
  }


   //problem 3
    String s1 = "balloon";
    String s2 = "atrophy";
    String output = "";

    if (s1.length() == s2.length()) {
      for (int i = s2.length()-1, i >= 0; i--) {
        String L1 = s1.substring(i, i+1);
        String L2 = s2.substring(i, i+1);
        output += (L2 + L1);
      }
    }
}
