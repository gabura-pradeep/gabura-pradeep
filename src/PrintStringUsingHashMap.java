import java.util.HashMap;
import java.util.Map;

public class PrintStringUsingHashMap {

	public static void main(String[] args) {
		
		String str=" ram:1,hari:2,jadu:3";
		
		String [] s=str.split("\\s");
		HashMap<String,Integer> map=new HashMap<String ,Integer>();
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		map.put(str, 1);
		map.put(str, 2);
		map.put(str, 3);
      
		System.out.println(map);
		System.out.println("--------------------------");
		System.out.println("HashMap elements: ");
	    for(Map.Entry test : map.entrySet()){
	    System.out.print("key: "+ test.getKey() + " and Value of Key=: ");
	    System.out.println(test.getValue());


	}

}
}
