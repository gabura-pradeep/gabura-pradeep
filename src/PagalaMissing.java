import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PagalaMissing {

	public static void main(String[] args) {
	int arr[]= {2,5,1,0,10,15};
	List<Object>list=new ArrayList<Object>();
	//Arrays.sort(arr);
	int maxElement=arr[arr.length-1];
	int minElement=arr[0];
	
	for(int i=minElement; i<=maxElement; i++)
	{
		boolean isFound=false;
		for(int index=0;index<arr.length; index++)
		{
			if(arr[index]==i)
			{
				isFound=true;
			}
			}
		if (!isFound)
		{
			list.add(i);
		}
	}
for(Object i: list)
{
	System.out.println("Misssing element="+i);
}
	}

}
