
public class Order {
  public static String order(String words) {
    if(words == "") {
      return "";
    }
    int i = words.split(" ").length;
    String order[] = new String[i];
    for(String word : words.split(" ")) {
      for(char letter : word.toCharArray()) {
        if(Character.isDigit(letter)) {
          if(Character.getNumericValue(letter)-1 == i-1) {
            order[Character.getNumericValue(letter)-1] = word;
          }
          else {
            order[Character.getNumericValue(letter)-1] = word + " ";
          }
        }
      }
    }

    StringBuilder sb = new StringBuilder();
    for(String string : order) {
      sb.append(string);
    }


    return sb.toString();
    // ...

  }
}