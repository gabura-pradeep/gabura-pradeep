import java.util.ArrayList;
import java.util.StringTokenizer;

public class Token1 {

	public static void main(String[] args) {
		String  str="My,name,is,Khan,sab";
		StringTokenizer tkn=new StringTokenizer(str, ",");
		System.out.println("Displaying Tokens: ");
	   /* while (tkn.hasMoreTokens()) {
	      System.out.println(tkn.nextToken());*/
	      
	   
	    
	    String[] stringarray = str.split(",");    //we can use dot, whitespace, any character   
	  //iterate over string array  
	  for(int i=0; i< stringarray.length; i++)  
	  {  
	  //prints the tokens  
	  System.out.println(stringarray[i]);
	  
	 /* ArrayList<Object> al=new ArrayList<Object>();
      al.add(stringarray[i]);
      System.out.println("-----------------------------------");
      System.out.println(al) ; */

	}
  
}
	
}
