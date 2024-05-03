import java.util.HashMap;

public class StringMaxReapetingChars {

	public static void main(String[] args) {
		
		String str="pradeep";
		//HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		
		char [] c=str.toCharArray();
		
		int count=0;
		
		for(int i=0; i<c.length; i++)
		{
			for(int j=i+1; j<c.length; j++)
			{
				if(c[i]==c[j])
				{
					count++;
					System.out.println(c[i]);
					//System.out.println("print count of chars:" +c[i] + - count);
				}
			}
		}
		

}
}