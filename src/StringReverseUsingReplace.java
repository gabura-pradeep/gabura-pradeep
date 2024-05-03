import java.util.Arrays;

public class StringReverseUsingReplace {

	public static void main(String[] args) {
		
		String str="kumar paradeep";
		String str1 []=str.split("\\s");
		String rev="";
		String a1=str1[0];
		char [] c1=a1.toCharArray();
		for(int i=c1.length-1; i>=0; i--)
		{
			rev=rev+a1.charAt(i);
			
		}
		
		String a2=str1[1];
		char [] c2=a2.toCharArray();
		for(int i=c2.length-1; i>=0; i--)
		{
			rev=rev+a2.charAt(i);
			
		}
		
		System.out.println(rev);
		
		

	}
	

}
