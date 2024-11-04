package automated_schedule;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRoleTest {
    private EmployeeRole employeeRole;

    @BeforeEach
    public void setUp() {
        employeeRole = new EmployeeRole();
    }

    @Test
    public void testAddGriller() {
        Employee griller = new Employee("John Doe", "griller", "Monday", 9.0, 17.0);
        boolean result = employeeRole.addEmployee(griller);
        assertTrue(result, "Griller should be added successfully.");
        assertEquals(1, employeeRole.all_Grillers.size(), "There should be one griller in the list.");
        assertEquals(griller, employeeRole.all_Grillers.get(0), "The added griller should match the input.");
    }

    @Test
    public void testAddFryer() {
        Employee fryer = new Employee("Jane Smith", "fryer", "Tuesday", 10.0, 18.0);
        boolean result = employeeRole.addEmployee(fryer);
        assertTrue(result, "Fryer should be added successfully.");
        assertEquals(1, employeeRole.all_Fryers.size(), "There should be one fryer in the list.");
        assertEquals(fryer, employeeRole.all_Fryers.get(0), "The added fryer should match the input.");
    }

    @Test
    public void testAddCashier() {
        Employee cashier = new Employee("Mark Brown", "cashier", "Wednesday", 11.0, 19.0);
        boolean result = employeeRole.addEmployee(cashier);
        assertTrue(result, "Cashier should be added successfully.");
        assertEquals(1, employeeRole.all_Cashiers.size(), "There should be one cashier in the list.");
        assertEquals(cashier, employeeRole.all_Cashiers.get(0), "The added cashier should match the input.");
    }

    @Test
    public void testAddSupervisor() {
        Employee supervisor = new Employee("Lisa White", "supervisor", "Thursday", 12.0, 20.0);
        boolean result = employeeRole.addEmployee(supervisor);
        assertTrue(result, "Supervisor should be added successfully.");
        assertEquals(1, employeeRole.all_Supervisors.size(), "There should be one supervisor in the list.");
        assertEquals(supervisor, employeeRole.all_Supervisors.get(0), "The added supervisor should match the input.");
    }

    @Test
    public void testAddDuplicateEmployee() {
        Employee employee1 = new Employee("Tom Green", "griller", "Friday", 9.0, 17.0);
        employeeRole.addEmployee(employee1); // First addition should succeed
        
        Employee employee2 = new Employee("Tom Green", "griller", "Saturday", 9.0, 17.0); // Same name and role
        boolean result = employeeRole.addEmployee(employee2); // Attempt to add again
        assertFalse(result, "Duplicate griller should not be added.");
        assertEquals(1, employeeRole.all_Grillers.size(), "There should still be one griller in the list.");
    }

    @Test
    public void testInvalidRole() {
        Employee invalidRoleEmployee = new Employee("Alice Black", "manager", "Sunday", 8.0, 16.0);
        boolean result = employeeRole.addEmployee(invalidRoleEmployee);
        assertFalse(result, "Invalid role should not be added.");
        assertEquals(0, employeeRole.all_Grillers.size(), "There should be no grillers in the list.");
        assertEquals(0, employeeRole.all_Fryers.size(), "There should be no fryers in the list.");
        assertEquals(0, employeeRole.all_Cashiers.size(), "There should be no cashiers in the list.");
        assertEquals(0, employeeRole.all_Supervisors.size(), "There should be no supervisors in the list.");
    }
}
