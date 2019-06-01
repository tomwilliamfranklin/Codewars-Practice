public class XO {

  public static boolean getXO(String str) {
    String e = str.toLowerCase();
    int xCount = 0;
    int oCount = 0;

    for (int i = 0; i != e.length(); i++) {
      if (e.charAt(i) == 'x') {
        xCount++;
      }
      if (e.charAt(i) == 'o') {
        oCount++;
      }
    }

    System.out.println(xCount + "|" + oCount);
    if(xCount==oCount) {
      return true;
    }
    else {
      return false;
    }
    // Good Luck!!
  }
}

