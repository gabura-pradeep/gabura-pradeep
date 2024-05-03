import java.util.HashMap;
import java.util.Map;

public class HashMapKeyValuePairOutPUT {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"rama");
		map.put(2, "hari");
		map.put(3, "jadu");
		System.out.println(map);
		System.out.println("--------------------------------------");
		System.out.println("HashMap elements: ");
	    for(Map.Entry test : map.entrySet()){
	    //System.out.print("key: "+ test.getKey() + " and Value of Key=: ");
	    System.out.println(test.getKey() + "=" + test.getValue());
	   
	   // System.out.println(test.getValue());

	}

}
}