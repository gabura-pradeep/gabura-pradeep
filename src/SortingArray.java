
public class SortingArray {

	public static void main(String[] args) {
		int a[]= {36,19,29,12,5};
		
		int temp;
		for(int i=0; i<a.length; i++)
		{
			
			for (int j=i; j<a.length; j++)
			{
				if(a[i]> a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
							
			for (int arr: a)
			{
				System.out.println(arr);
			}
			
			
		}
		
		

	}

}
