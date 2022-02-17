import java.util.*;

public class Solution {

  private static String getRuler(String kingdom) {
    // TODO: implement this method to determine the ruler name, given the kingdom.
    String ruler = "";
    int len = kingdom.length();
    if (kingdom.charAt(len - 1) == 'A' || kingdom.charAt(len - 1) == 'E' || kingdom.charAt(len - 1) == 'I' || kingdom.charAt(len - 1) == 'O' || kingdom.charAt(len - 1) == 'U' || kingdom.charAt(len - 1) == 'a' || kingdom.charAt(len - 1) == 'e' || kingdom.charAt(len - 1) == 'i' || kingdom.charAt(len - 1) == 'o' || kingdom.charAt(len - 1) == 'u'){
        ruler = "Alice";
    }
    else if (kingdom.charAt(len - 1) == 'Y' || kingdom.charAt(len - 1) == 'y'){
        ruler = "nobody";
    }
    else{
        ruler = "Bob";
    }
    return ruler;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();

      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}


