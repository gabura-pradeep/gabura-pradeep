import java.util.Arrays;

public class secondlargenumber {

	public static void main(String[] args) {
		int temp, size;
	      int array[] = {57,96,63,25,20,10};
	      size = array.length;
	      Arrays.sort(array);

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){

	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("Third second largest number is:: "+array[size-2]);
	      System.out.println("-----------------------------------");
	      for(Integer a: array)
	      {
	    	  System.out.println(a);
	      }
	   }
	
	}


