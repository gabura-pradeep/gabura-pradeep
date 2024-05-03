
public class TestString {

	public static void main(String[] args) {
		
		String str1="abc";
		String str2="pqr";
		String str3=str1+str2;
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=i; j<str2.length(); j++)
			{
				char s=str3.charAt(i);
				System.out.println(s);
			}
			//System.out.println(s);
		}
       // System.out.println(s);
	}

}
