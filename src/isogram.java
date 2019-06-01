public class isogram {
    /*
        An isogram is a word that has no repeating letters, consecutive or non-consecutive.
        Implement a function that determines whether a string that contains only letters is an isogram.
        the empty string is an isogram. Ignore letter case.
     */
    public static boolean  isIsogram(String str) {
        String word = str.toLowerCase();
        for (char letter : word.toCharArray()) {
            int count = 0;
            for(int i=0; i<word.length(); i++) {
                if (word.charAt(i) == letter) {
                    count++;
                }
            }
            if(count >= 2) {
                return false;
            }
        }
    return true;
    }
}


