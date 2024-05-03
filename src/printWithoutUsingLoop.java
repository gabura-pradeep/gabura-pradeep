
public class printWithoutUsingLoop {

	public static void main(String[] args) {
		
		String str="12345678910";
		String s="i";
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", str +"\n");
		
		System.out.println(s);
		
		


	}

}
