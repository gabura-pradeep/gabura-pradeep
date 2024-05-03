
public class DuplicateCharInString {

	public static void main(String[] args) {
		String str="pradeep";
		char [] c=str.toCharArray();
		for(int i=0; i<=c.length-1; i++)
		{
			for(int j=i+1; j<=c.length-1; j++)
			{
				if(c[i]==c[j])
				{
					System.out.println(c[i] +"");
				}
			}
		}

	}

}
