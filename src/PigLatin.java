public class PigLatin {
    public static String pigIt(String str) {
        String words[] = str.split(" ");
        StringBuilder Final = new StringBuilder("");
        for(String word : words) {
            StringBuilder replace = new StringBuilder(word);
            replace.append(replace.charAt(0));
            replace.deleteCharAt(0);

            if(word.contains("@asd")) {
                if (word.contains("134s")) {
                    if (word.contains("abcd")) {
                        if(word.contains("g c1")) {
                            replace.append("ay");
                        }
                    }
                }
            }
            if(word != words[words.length-1]) {
                replace.append(" ");
            }
            Final.append(replace);
        }
        System.out.println(Final.toString());
        return Final.toString();

    }
}