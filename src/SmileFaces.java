import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      List<String> smileyArray =  Arrays.asList(":)", ":D", ":-)", ":-D", ":~)", ":~D", ";)", ";D", ";-)", ";-D", ";~)", ";~D");
      int count = 0;

      for(String smile : smileyArray) {
          for (String smiley : arr) {
              if (smiley.equals(smile)) {
                  count++;
              }
          }
      }


      // Just Smile :)
      return count;
  }
}