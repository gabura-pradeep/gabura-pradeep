import java.util.Arrays;

public class duplicate1 {

	public static void main(String[] args) {
		
		int[] a= {1,1,2,2,3,3};
		
		int[] temp=new int [a.length-3];
		int j=0;
		
		for(int i=0; i<a.length-1; i++)
		{
			
			
				if (a[i]==a[i+1])
				{
					
					temp[j]=a[i];
					j++;
				}
				
		
      // System.out.println("print the array: "+ Arrays.toString(temp));
       
       //System.out.println(temp);
	}

		System.out.println("print the array: "+ Arrays.toString(temp));
	       
}
}