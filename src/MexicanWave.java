import java.util.ArrayList;
/*
 	In this simple TripleDouble your task is to create a function that turns a string into a Mexican Wave.
 	You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
 */
public class MexicanWave {
    public static String[] wave(String str) {
        ArrayList<String> stages = new ArrayList<String>();

        for(int letter = 0;letter<str.length(); letter++) {
            StringBuilder string = new StringBuilder(str);
            if(Character.isAlphabetic(string.charAt(letter))) {
                string.setCharAt(letter, Character.toUpperCase(string.charAt(letter)));
                stages.add(string.toString());
            }
        }
        // Your code here
        String Final[] = stages.toArray(new String[stages.size()]);
        return Final;
    }

}