import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {
    
    public static List<Integer> sumConsecutives(List<Integer> s) {
        int temp = 0;
        List<Integer> Finals = new ArrayList<Integer>();
        //System.out.println(s.subList(0,s.toArray().length));


        for(int i = 0; i<s.toArray().length; i++) {
            if(i+1 != s.toArray().length) {
                temp = temp + s.get(i);
                 if (s.get(i) != s.get(i + 1)) {
                    Finals.add(temp);
                    temp = 0;
                }
            }
            else {
                temp = temp + s.get(i);
                Finals.add(temp);
            }

        }
        return Finals;

    }

}