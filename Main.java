public class Main
{
  public static void main(String[] args)
  {
    // write your code here
    // lastFirstN("koolaid", "water", 3);

    stringManip("pizza ", "sleep");
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    // String output;
    // String firstN; 
    // String lastN;
    // // to do, assign values to firstN and lastN that solves the problem 

    // output = lastN + firstN;
    // System.out.println(output);


  
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    
    // String sUpper;
    // String sL;

    String Up = s1.toUpperCase();


    String Reg0 = s2;
    // String Reg = Reg.substring(0, 1).toUpperCase();
    String firstLetter = Reg0.substring(0, 1);  // first letter of 2nd word
    String firstLetterCAPS = firstLetter.toUpperCase(); 
    String everythingAfter = s2.substring(1);  // everything AFTER the 1st letter
    everythingAfter = everythingAfter.toLowerCase();
    Reg0 = firstLetter + everythingAfter;
   

    String output = Up + Reg0;
    System.out.println(output);




  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
