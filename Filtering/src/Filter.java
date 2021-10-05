import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {
	

	
	public static void main(String[] args) {
		List<Employee> employeeList=Arrays.asList
				(new Employee("SE","Mohamed","01234"),
				 new Employee("HR","Ahmed","011987"),
				 new Employee("CTRL","Yasser","010923"),
				 new Employee("HR","Noha","0118704"),
				 new Employee("SE","Malak","012141")
				);
		
		Map<String, List<Employee>> groupByTitle = 
                employeeList.stream().collect(Collectors.groupingBy(Employee::getTitle));
		for (Map.Entry<String,List<Employee>> entry : groupByTitle.entrySet()) {
			System.out.println(entry.getKey() +"\n"+"count ="+entry.getValue().size()+entry.getValue());
		}	
	}
}