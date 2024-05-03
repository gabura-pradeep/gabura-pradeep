
public class CountCharInString {

	public static void main(String[] args) {
		
		String str="pradeep";
		char [] c=str.toCharArray();
		int count=0;
		for(int i=0; i<c.length; i++)
		{
			if(c[i]=='p')
			{
				count++;
			}
		}
		
		System.out.println("chars are repreted :" +count);
	}

}
