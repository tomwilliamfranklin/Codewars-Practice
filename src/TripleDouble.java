public class TripleDouble
{
  public static int TripleDouble(long num1, long num2) 
  {
    /*
    which takes numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.

    If this isn't the case, return 0
     */
    char priorNum = ' ';
    int i =0;
    boolean triple = false;
    boolean d0uble = false;
    char requiredNum = ' ';
    for(char num : Long.toString(num1).toCharArray()) {
      if(num == priorNum) {
        i++;
      }
        if(num != priorNum) {
          i=0;
        }

      if(i == 2) {
        requiredNum = num;
        triple = true;
        break;
      }
        priorNum = num;

    }
    i=0;
    priorNum = ' ';

    for(char num : Long.toString(num2).toCharArray()) {
      if (num != priorNum) {
        i = 0;
      }
      if (num == requiredNum) {
        if (num == priorNum) {
          i++;
        }
        if (i == 1) {
          d0uble = true;
          break;
        }
      }
      priorNum = num;
      }

    if(triple == true && d0uble == true) {
      return 1;
    }
    else {
      return 0;
    }
  }

}