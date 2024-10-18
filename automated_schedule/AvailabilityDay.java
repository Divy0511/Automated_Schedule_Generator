package automated_schedule;

import java.util.*;

public class AvailabilityDay {
    private Map<String, List<Employee>> availability;

    public AvailabilityDay() {
        availability = new HashMap<>();
        // Initialize the map with days of the week
        availability.put("Monday", new ArrayList<>());
        availability.put("Tuesday", new ArrayList<>());
        availability.put("Wednesday", new ArrayList<>());
        availability.put("Thursday", new ArrayList<>());
        availability.put("Friday", new ArrayList<>());
        availability.put("Saturday", new ArrayList<>());
        availability.put("Sunday", new ArrayList<>());
    }

    public void addAvailability(Employee employee) {
        String day = employee.getDay().substring(0, 1).toUpperCase() + employee.getDay().substring(1).toLowerCase();
        if (availability.containsKey(day)) {
            availability.get(day).add(employee);
        } else {
            throw new IllegalArgumentException("Invalid day of the week");
        }
    }


    public void sortAvailability() {
        for (List<Employee> employees : availability.values()) {
            employees.sort(Comparator.comparing(Employee::getStartTime)); // Sort by start time
        }
    }

    public Map<String, List<Employee>> getAvailability() {
        return availability;
    }
    
    
   

	
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

























