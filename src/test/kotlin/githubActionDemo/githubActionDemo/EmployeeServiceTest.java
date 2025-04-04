package githubActionDemo.githubActionDemo;

import githubActionDemo.githubActionDemo.model.Employee;
import githubActionDemo.githubActionDemo.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class EmployeeServiceTest {
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    void shouldReturnListOfEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        assertNotNull(employees);
        assertEquals(3, employees.size());
        assertEquals("John Doe", employees.get(0).getName());
        assertEquals("Jane Smith", employees.get(1).getName());
        assertEquals("Alice Brown", employees.get(2).getName());
    }
}
