package automated_schedule;

import java.util.Arrays;

public class EmployeeRole {
    private String[] all_Grillers;
    private String[] all_Fryers;
    private String[] all_Cashiers;
    private String[] all_Supervisors;

    public EmployeeRole() {
        all_Grillers = new String[10];
        all_Fryers = new String[10];
        all_Cashiers = new String[10];
        all_Supervisors = new String[10];
    }

    public boolean addEmployee(String name, String postion) {
        switch (postion.toLowerCase()) {
            case "griller":
                return addToRole(all_Grillers, name);
            case "fryer":
                return addToRole(all_Fryers, name);
            case "cashier":
                return addToRole(all_Cashiers, name);
            case "supervisor":
                return addToRole(all_Supervisors, name);
            default:
                return false; // Invalid role
        }
    }

    private boolean addToRole(String[] roleArray, String name) {
        for (int i = 0; i < roleArray.length; i++) {
            if (roleArray[i] == null) {
                roleArray[i] = name;
                return true;
            }
        }
        return false; // No space available
    }

    public String[] getEmployeesByRole(String role) {
        switch (role.toLowerCase()) {
            case "griller":
                return Arrays.stream(all_Grillers).filter(name -> name != null).toArray(String[]::new);
            case "fryer":
                return Arrays.stream(all_Fryers).filter(name -> name != null).toArray(String[]::new);
            case "cashier":
                return Arrays.stream(all_Cashiers).filter(name -> name != null).toArray(String[]::new);
            case "supervisor":
                return Arrays.stream(all_Supervisors).filter(name -> name != null).toArray(String[]::new);
            default:
                return new String[0]; // Invalid role
        }
    }

    public String[][] getAllRoles() {
        return new String[][] {
            getEmployeesByRole("griller"),
            getEmployeesByRole("fryer"),
            getEmployeesByRole("cashier"),
            getEmployeesByRole("supervisor")
        };
    }
}











