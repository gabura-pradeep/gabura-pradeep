import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSetForIntegerArray {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,2,3,3,3,3,5,6,7,7,8,8};
		
		Set<Object> dup=new HashSet<Object>();
		
		for(int i=0; i<a.length; i++)
		{
			if(dup.add(a[i])==false)
			{
				System.out.println("Print the Duplicate Numbers:" +a[i]);
			}
		}
		
}

}