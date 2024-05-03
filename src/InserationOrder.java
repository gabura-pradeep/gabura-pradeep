import java.util.ArrayList;
import java.util.Collections;

public class InserationOrder {

	public static void main(String[] args) {
		
		int [] a= {1,2,0,3,0,4,0};
		
		int [ ] b=new int [a.length];
		
		int temp;
		
		for(int i=0; i<a.length; i++)
		{
			for( int j=i;j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("print the array");
		
		for(int array: a)
		{
			System.out.println(array);
		}
		System.out.println("--------------------------------------");
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
        System.out.println(al);
        
        Collections.sort(al);
        
        System.out.println(al);
	}

}
