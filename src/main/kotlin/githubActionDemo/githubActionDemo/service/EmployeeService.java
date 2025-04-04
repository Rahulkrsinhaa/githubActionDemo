package githubActionDemo.githubActionDemo.service;

import githubActionDemo.githubActionDemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public  class EmployeeService {
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("1", "John Doe", "IT"),
                new Employee("2", "Jane Smith", "HR"),
                new Employee("3", "Alice Brown", "Finance")
        );
    }
}
