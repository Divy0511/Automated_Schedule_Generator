package automated_schedule;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRole {
    public static List<String> all_Grillers;
    public static List<String> all_Fryers;
    public static List<String> all_Cashiers;
    public static List<String> all_Supervisors;
    
    public EmployeeRole() {
        all_Grillers = new ArrayList<>();
        all_Fryers = new ArrayList<>();
        all_Cashiers = new ArrayList<>();
        all_Supervisors = new ArrayList<>();
    }
    
    public boolean addEmployee(Employee employee) {
        String position = employee.getPosition();
        
        switch (position.toLowerCase()) {
            case "griller":
                return addToRole(all_Grillers, employee);
            case "fryer":
                return addToRole(all_Fryers, employee);
            case "cashier":
                return addToRole(all_Cashiers, employee);
            case "supervisor":
                return addToRole(all_Supervisors, employee);
            default:
                return false; // Invalid role
        }
    }

    public boolean addToRole(List<String> roleList, Employee employee) {
        String employeeName = employee.getName();
        
        for (String name : roleList) {
            if (name.equals(employeeName)) {
                return false; // Employee already exists in this role
            }
        }
        
        roleList.add(employeeName); // Add only the name to the list
        return true; // Successfully added
    }
    
   public static void main(String[] args) {
	   
       EmployeeRole employeeRole = new EmployeeRole();

       Employee hiren = new Employee("J", "griller", "Monday", 9.0, 17.0);
       Employee divy = new Employee("Doe", "griller", "Monday", 9.0, 17.0);
       Employee hel = new Employee("John ", "griller", "Monday", 9.0, 17.0);
       Employee griller = new Employee("divy", "fryer", "Tuesday", 9.0, 17.0);
       
       
       
       employeeRole.addEmployee(hiren);
       employeeRole.addEmployee(divy);
       employeeRole.addEmployee(hel);
       employeeRole.addEmployee(griller);

   
//	   
//	System.out.println(all_Grillers);
//	System.out.println(all_Fryers);
//	System.out.println(all_Cashiers);

	
}
}
