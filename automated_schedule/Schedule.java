package automated_schedule;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

public class Schedule {
    private HashMap<String, ArrayList<Employee>> shifts;
    private HashMap<String, HashSet<Employee>> assignedEmployees; // Track assigned employees for each day
    private AvailabilityDay availabilityDay; // Holds the availability of employees by day
    private EmployeeRole employeeRole; // Holds all employees by their roles

    public Schedule(AvailabilityDay availabilityDay, EmployeeRole employeeRole) {
        this.shifts = new HashMap<>();
        this.assignedEmployees = new HashMap<>();
        this.availabilityDay = availabilityDay;
        this.employeeRole = employeeRole;

        // Initialize shifts
        initializeShifts();
    }

    private void initializeShifts() {
        // Create empty lists for each shift
        shifts.put("9:00 AM - 4:30 PM - Griller", new ArrayList<>());
        shifts.put("10:00 AM - 5:00 PM - Supervisor", new ArrayList<>());
        shifts.put("11:00 AM - 5:00 PM - Fryer", new ArrayList<>());
        shifts.put("11:00 AM - 5:00 PM - Cashier", new ArrayList<>());
        shifts.put("5:00 PM - 12:00 AM - Fryer", new ArrayList<>());
        shifts.put("5:00 PM - 12:00 AM - Cashier", new ArrayList<>());
        shifts.put("5:00 PM - 12:00 AM - Supervisor", new ArrayList<>());
        shifts.put("5:00 PM - 11:30 PM - Griller", new ArrayList<>());
    }

    // Method to assign employees to a shift if available and they match the role
    public boolean assignToShift(String shiftKey, String role, String day) {
        // Initialize assigned employees for the day if not already done
        assignedEmployees.putIfAbsent(day, new HashSet<>());

        List<Employee> availableEmployees = availabilityDay.getAvailability().get(day); // Get employees available on that day
        if (availableEmployees == null) {
            return false; // No employees available on that day
        }

        // Get employees from the EmployeeRole class by role
        String[] employeesByRole = employeeRole.getEmployeesByRole(role);

        // Use a normal for loop to iterate over employees by role
        for (String employeeName : employeesByRole) {
            // Use a normal for loop to iterate over available employees
            for (Employee employee : availableEmployees) {
                if (employee.getName().equals(employeeName) && !assignedEmployees.get(day).contains(employee)) {
                    // Employee matches the role, is available, and not already assigned for the day
                    shifts.get(shiftKey).add(employee);
                    assignedEmployees.get(day).add(employee); // Mark this employee as assigned for the day
                    return true; // Successfully assigned employee to the shift
                }
            }
        }
        return false; // No employee found that matches both role and availability
    }

    // Method to return the full schedule for all shifts
    public Map<String, List<Employee>> getFullSchedule() {
        return new HashMap<>(shifts); // Return a copy of shifts to avoid modification
    }
}










