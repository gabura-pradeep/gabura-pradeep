import java.util.ArrayList;
import java.util.Collections;

public class countofchars {

	public static void main(String[] args) {
		
		String str="pradeep";
		char [] c=str.toCharArray();
		
		ArrayList<Object> al= new ArrayList<Object>();
		
		for(int i=0; i<c.length; i++)
		{
			al.add(c[i]);
		}
        //System.out.println(al);
		
		System.out.println("Frequency of the word p:"+Collections.frequency(al, 'p'));
}
}