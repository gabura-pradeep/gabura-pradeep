import java.util.ArrayList;
import java.util.Collections;

public class collectionsort {
	
	public static void main(String [] args) {
		
		int a[]= {1,5,10,7,100,45};
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("After Sorting");
		System.out.println(al);
	}
	
	

}
