import java.util.Arrays;

public class SpinWords {

  public static String spinWords(String sentence) {
    String spinnedWords = "";
      for(String word : sentence.split(" ")) {
        if (word.length() >= 5) {
          StringBuilder backwards = new StringBuilder(word);
          String reverse = backwards.reverse().toString();
          spinnedWords = spinnedWords + reverse + " ";
        }
        else {
          spinnedWords = spinnedWords + word + " ";
        }
      }
        return spinnedWords.trim();
  }
}