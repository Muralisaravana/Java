/*Group employees by department
For each department, find the employee with the highest salary
Sort results by department name
Expected Output
Finance - Frank - 75000
HR - Charlie - 65000
IT - Eve - 90000*/


package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DayTen_GroupBy {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR", 50000),
			    new Employee("Bob", "IT", 70000),
			    new Employee("Charlie", "HR", 65000),
			    new Employee("David", "Finance", 60000),
			    new Employee("Eve", "IT", 90000),
			    new Employee("Frank", "Finance", 75000)
			);
		Map<String, Optional<Employee>> topByDept =
		employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
        ));
		
		topByDept.entrySet().stream()
         .sorted(Map.Entry.comparingByKey())
         .forEach(entry -> {
             String dept = entry.getKey();
             entry.getValue().ifPresent(e ->
                 System.out.printf("%s - %s - %d%n", dept, e.getName(), e.getSalary())
             );
         });


	}



static class Employee {
    private final String name;
    private final String department;
    private final int salary;

    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + department + ") : " + salary;
    }
}

}


