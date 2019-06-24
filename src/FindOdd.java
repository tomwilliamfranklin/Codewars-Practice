public class FindOdd {
	public static int findIt(int[] a) {

		int prevNum = 0;
		int count = 0;
  		for(int i = 0; i<a.length;i++) {
  			if(count != 0 && count%2 == 1) {
  				return a[i];
			}
  			if(a[i] == prevNum) {
  				System.out.println("Yes");
  				count++;
			}
  			if(a[i] != prevNum) {
  				count = 0;
			}
  			prevNum = a[i];
		}
  		return 0;
  }
}