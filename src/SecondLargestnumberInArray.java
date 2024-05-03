import java.util.Arrays;

public class SecondLargestnumberInArray {

	public static void main(String[] args) {
		int array[] = {57,96,63,25,20,10};
	      int size = array.length;
	      Arrays.sort(array);
	     // System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);
	   }
	

	}


