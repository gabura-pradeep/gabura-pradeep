
public class RecursionExample1 {
	static int count=0;
	
	static void p(){ 
		
		count++;  
		if(count<=10) 
		
		{
		System.out.println("pradeep"); 
		
		p();
		 
		
	}
	}
	public static void main(String[] args) {
		
		//RecursionExample1.p();
		p();
	}

}
