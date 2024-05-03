
public class NewClass {

	public static void main(String[] args) {
		
		String str1 = "abc";
			
		String str2 = "pqr";
		
		String str3= str1+str2;
		System.out.println(str3);
		
		char [] s=str3.toCharArray();
		
		for(int i=0; i<s.length-1; i++)
		{
			String s1="";
			
			s1=s1+s1.charAt(i);
			System.out.println(s1);
		}
		
	}

}

//apbqcr