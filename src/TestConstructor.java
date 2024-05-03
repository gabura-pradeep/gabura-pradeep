
public class TestConstructor {
	
	int a;
	int b;
	
	public TestConstructor( int i, int j)
	{
		this.a=i;
		this.b=j;
	}
	
	void add()
	{
		int sum =a+b;
		System.out.println( "print the sum of two numbers:"+sum);
	}
	

	public static void main(String[] args) {
		
		TestConstructor tc1=new TestConstructor(2,3);
		tc1.add();
		

	}

}
