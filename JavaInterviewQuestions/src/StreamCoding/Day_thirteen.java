/*given a list of Employee objects.
 * write code to:
Group employees by department
Find the highest paid employee in each department
Print the result sorted by department name
 **/
package StreamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StreamCoding.DayTen_GroupBy.Employee;

public class Day_thirteen {
	public static void main(String[] args) {
	  List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "HR", 50000),
	            new Employee("Bob", "IT", 70000),
	            new Employee("Charlie", "HR", 65000),
	            new Employee("David", "Finance", 60000),
	            new Employee("Eve", "IT", 90000),
	            new Employee("Frank", "Finance", 75000)
	        );

	        employees.stream()
	            .collect(Collectors.groupingBy(
	                Employee::getDepartment,
	                Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))
	            ))
	            .entrySet().stream()
	            .sorted(Map.Entry.comparingByKey())
	            .forEach(entry ->
	                System.out.println(
	                    entry.getKey() + " = " + entry.getValue().get().getName()
	                )
	            );
	    }
	}

