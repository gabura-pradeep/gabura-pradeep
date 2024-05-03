import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		
		int a [] = {1,5,7,3,6,0};
		
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++)
			{
				if(a[i]> a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			
			
		}
			
		for(int array: a)
		{
			System.out.println(array);
		}

	}

}
