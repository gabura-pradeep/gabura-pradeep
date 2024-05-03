import java.util.ArrayList;
import java.util.Collections;

public class StringReverseUsingCollection {

	public static void main(String[] args) {
		
		
		String s="pradeep";
		char [] Str=s.toCharArray();
		ArrayList<Object> al= new ArrayList<Object>();
		for(int i=0; i<Str.length; i++)
		{
			al.add(Str[i]);
		}
		
		Collections.reverse(al);
		
		System.out.println(al);

}
}
