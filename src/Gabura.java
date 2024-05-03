import java.util.ArrayList;
import java.util.Collections;

public class Gabura {

	public static void main(String[] args) {
		String  str="hello gabura hello gabura hello gabura";
		String [] s=str.split("\\s");
		ArrayList<Object> ar=new ArrayList<Object>();

        for(int i=0; i<s.length; i++)
        {
        	//System.out.println(s[i]);
        	ar.add(s[i]);
        	System.out.println(ar);
        	System.out.println("--------------------------------------------------------------------");
        }
        
        System.out.println("Frequency of the word hello:"+Collections.frequency(ar, "hello"));
        System.out.println("Frequency of the word Gabura:"+Collections.frequency(ar, "gabura"));
       
	}

}
