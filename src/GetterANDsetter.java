
public class GetterANDsetter {
	
	int id;
	String name;
	String address;
	int marks;
	
	// Define constructor
	
	public GetterANDsetter(int ID, String NAME, String ADDRESS, int MARKS)
	{
		this.id=ID;
		this.name=NAME;
		this.address=ADDRESS;
		this.marks=MARKS;
	}
	
	
	
	
	//Setter method to store the variable
	
	void setID(int id)
	{
		this.id=id;
	}

	void setName(String name)
	{
		this.name=name;
	}
	
	void setAddress(String address)
	{
		this.address=address;
	}
	
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	//To  retrive the values
	
	int getId()
	{
		return id;
	}
	
	String  getName()
	{
		return name;
	}
	
	String getAddress()
	{
		return address;
	}
	
	int getMarks()
	{
		return marks;
	}
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		System.out.println(marks);
	}
	public static void main(String[] args) {
		GetterANDsetter obj=new GetterANDsetter(2, "budhaview", "504", 500);
		
		obj.display();

	}

}
