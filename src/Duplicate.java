import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3};
		
		Set<Integer>dup= new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			if(dup.add(a[i])==false)
			{
				//System.out.println(dup);
			}
		}
		System.out.println(dup);
	}

}
