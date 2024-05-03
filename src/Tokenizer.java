import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		
        String mydelim = " : ";
        String mystr = "JAVA :1 Code : 2 String : 3 Tokenizer : 4 Geeks:5";
        
        StringTokenizer geeks3 =new StringTokenizer(mystr, mydelim);
 
        // Printing count of tokens and tokens
        // using countTokens() method
        
         int count = geeks3.countTokens();
        System.out.println("Number of tokens : " + count + "\n");
        
        //Create an ArrayLIst
        
        ArrayList<Object> al=new ArrayList<Object>();
 
        // Iterating to get the tokens
        for (int i = 0; i < count; i++)
        System.out.println("token at [" + i + "] : " + geeks3.nextToken());
                            
            System.out.println("----------------------------------");
            al.add(geeks3.countTokens()) ;       
           System.out.println(al);
        
         System.out.println("-----------------------------------------");
         
         while(geeks3.hasMoreTokens())
         {
        	 System.out.println(geeks3.nextToken());
         }
	}

}
