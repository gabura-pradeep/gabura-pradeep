import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDigitfromStringUsingisDigit {

	public static void main(String[] args) {
		
		String str="this123is456java789program";
		char [] c=str.toCharArray();
		
		String result="";
		
		
		ArrayList<Object> obj=new ArrayList<Object>();
		
		for(int i=0; i<c.length; i++)
		{
			
				obj.add(c[i]);
				
			}
		
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(obj);
		}
	
			}

	

