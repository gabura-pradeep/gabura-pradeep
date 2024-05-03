
public class print {

	public static void main(String[] args) {
		System.out.println("Print the numbers");
		System.out.println("======================================");
		
		for(int i=1; i<=10; i++)
		{
			if(i==6)
				continue;
			System.out.println(i);
		}
	}

}
