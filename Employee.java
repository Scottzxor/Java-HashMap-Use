
public class Employee {
	
	private int employeeID;
	private String employeeName;
	
	public Employee (int id, String name) {
		employeeID = id;
		employeeName = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	
	public void setEmployeeID(int id) {
		employeeID = id;
	}
	
	public void setEmployeeName(String n) {
		employeeName = n;
	}
	
	public String toString() {
		return "Employee ID: " + employeeID 
				+ "\nEmployee Name: " + employeeName;
	}
	
	public int hashCode() {
		return employeeName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Employee) ) 
			return false;
	else {
		Employee tempEmp = (Employee) obj;
		return employeeName.equalsIgnoreCase(tempEmp.employeeName);
	}
}
}
