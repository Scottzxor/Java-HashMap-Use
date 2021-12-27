import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {

	public static void main(String[] args) {
	
		
		Map<Integer, Employee> employeeMap = new HashMap<>();
		
		//instantiating Employees
		Employee employee1 = new Employee(423, "Jim");
		Employee employee2 = new Employee(511, "Jane");
		Employee employee3 = new Employee(561, "Jessica");
		Employee employee4 = new Employee(521, "Terry");
		
		//placing employees into HashMap
		employeeMap.put(423, employee1);
		employeeMap.put(511, employee2);
		employeeMap.put(561, employee3);
		employeeMap.put(521, employee4);

		//Search for Employee via ID
		System.out.println("\nSearching for the car with " + "ID " + employee3.getEmployeeID());
		
		Employee foundEmployee = employeeMap.get(employee3.getEmployeeID());
	
		// If employee found display:
		
		if (foundEmployee != null) {
			System.out.println(foundEmployee);
		}
		else {
			System.out.println("The Employee is not in the database");
		}
		
		//Search for employee that isn't in the database.
		System.out.println("\nSearching for the car with " + "ID " + 3423);
		
		foundEmployee = employeeMap.get(3423);
		
		if (foundEmployee != null) {
			System.out.println(foundEmployee);
		}
		else {
			System.out.println("The Employee is not in the database");
		}
	}
	}
