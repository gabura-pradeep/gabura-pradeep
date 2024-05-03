
 abstract class Base {

	 abstract void printInfo();
	}
	 
	// Abstraction performed using extends
	class Employee extends Base {
	    void printInfo()
	    {
	        String name = "avinash";
	        int age = 21;
	        float salary = 222.2F;
	 
	        System.out.println(name);
	        System.out.println(age);
	        System.out.println(salary);
	    }
	}
	 
	// Base class
	class Base1 {
	    public static void main(String args[])
	    {
	        Base s = new Employee();
	        s.printInfo();
	    }
	
	
	
		
	}


