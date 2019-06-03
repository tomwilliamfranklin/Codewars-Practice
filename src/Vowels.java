import java.util.Arrays;

public class Vowels {
/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this FindMissingLetter.

The input string will only consist of lower case letters and/or spaces.
*/

  public static int getCount(String str) {
    int vowelsCount = 0;
    String word = str.toLowerCase();
    Character vowels[] = {'a', 'e', 'i', 'o', 'u'}; //edit to your liking

    for (char letter : word.toCharArray()) {
        for(char vowel : vowels) {
                if(letter == vowel) {
                    vowelsCount++;
                }
        }
    }

    // your code here
    return vowelsCount;
  }

}