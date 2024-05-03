package PojoClass;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeWithAllData {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setName("pradeep");
		emp1.setAddress("hyd");
		emp1.setMarried(true);
		emp1.setMobileNo("1234567890");
		
		ObjectMapper mapper=new ObjectMapper();
		
        // String emp1data= mapper.writeValueAsString(emp1);
	}

}
