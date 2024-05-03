

public class StringRever {

	public static void main(String[] args) {
		
		String str="WELCOME SELENIUM";
		str = str.replaceAll("\\s", "");
		 
        System.out.println(str);
		
		char [] c=str.toCharArray();
		 String rev="";
		 
		 for(int i=c.length-1; i>=0; i--)
		 {
			 rev=rev+str.charAt(i);
		 }
		 
		 System.out.println(rev);
	}

}
