import java.util.ArrayList;

public class palindrom {

	public static void main(String[] args) {
		int r,sum=0,temp;  
		int n=121;
		temp=n;
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		while(n>0)
		{
			 r=n%10;
			 System.out.println(r);
			 al.add(r);
			 
			 sum=(sum*10)+r;
			 n=n/10;
			
						
		}
		
		System.out.println(al);
		System.out.println(al.indexOf(5));
		 if(temp==sum) 
		 
			   System.out.println("palindrome number "); 
		       
		        
			  else    
			   System.out.println("not palindrome"); 
		       System.out.println(sum);
		       
		
	}
	
	
}

