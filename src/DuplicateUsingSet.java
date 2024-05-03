import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {

	public static void main(String[] args) {
		int [] a= {1,1,2,2,2,3,3,3,3};
		ArrayList<Object> al=new ArrayList<Object>();
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
		System.out.println("Frequecy of the number  1 :" +Collections.frequency(al, 1));
		System.out.println("Frequecy of the numbers 2 :" +Collections.frequency(al, 2));
		System.out.println("Frequecy of the numbers 3 :" +Collections.frequency(al, 3));

	}

}
