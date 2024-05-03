import java.lang.System.Logger.Level;

public class testEnum {
	
	 enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}

	public static void main(String[] args) {
		
		 

		 Level myVar = Level.HIGH; 
		 Level myVar1 = Level.LOW; 
		 Level myVar2 = Level.MEDIUM; 
		 System.out.println(myVar);
		 System.out.println(myVar1);
		 System.out.println(myVar2);
	}
	
}
