package automated_schedule;


import java.util.*;

public class Availability {
    public static List<String> mondayAvailability;
    public static List<String> tuesdayAvailability;
    public static List<String> wednesdayAvailability;
    public static List<String> thursdayAvailability;
    public static List<String> fridayAvailability;
    public static List<String> saturdayAvailability;
    public static List<String> sundayAvailability;
    public static List<String> morningShift;
    public static List<String> eveningShift;
    public static List<String> fullDayShift;
    

    
	public Availability() {
        mondayAvailability = new ArrayList<>();
        tuesdayAvailability = new ArrayList<>();
        wednesdayAvailability = new ArrayList<>();
        thursdayAvailability = new ArrayList<>();
        fridayAvailability = new ArrayList<>();
        saturdayAvailability = new ArrayList<>();
        sundayAvailability = new ArrayList<>();
        
        
         morningShift = new ArrayList<>();
         eveningShift = new ArrayList<>();
         fullDayShift = new ArrayList<>();
    }
	
	


    // Method to sort employees by day
    public void sortByDay(Employee employee) {
        String day = employee.getDay();
        String employeeName = employee.getName();


        switch (day) {
            case "Monday":
                mondayAvailability.add(employeeName);
                break;
            case "Tuesday":
                tuesdayAvailability.add(employeeName);
                break;
            case "Wednesday":
                wednesdayAvailability.add(employeeName);
                break;
            case "Thursday":
                thursdayAvailability.add(employeeName);
                break;
            case "Friday":
                fridayAvailability.add(employeeName);
                break;
            case "Saturday":
                saturdayAvailability.add(employeeName);
                break;
            case "Sunday":
                sundayAvailability.add(employeeName);
                break;
            default:
                throw new IllegalArgumentException("Invalid day of the week");
        }
    }


        // Method to sort employees into morning, evening, and full-day shifts
       
            public void sortByTime(Employee employee) {
                String employeeName = employee.getName();

                if (employee.getStartTime() >= 12.0 && employee.getEndTime() <= 24.0) {
                    eveningShift.add(employeeName);
                } 
                else if (employee.getStartTime() >= 9.0 && employee.getEndTime() <= 21.0) {
                    morningShift.add(employeeName);
                }
                else {
                	fullDayShift.add(employeeName); // Full-day availability
                }
            }


//            public static void main(String[] args) {
//                Availability availability = new Availability();  // Create an instance of Availability
//
//                Employee hiren = new Employee("Hiren", "griller", "Monday", 15.0, 24.0);
//                Employee divy = new Employee("Divy", "griller", "Monday", 16.0, 24.0);
//                Employee hel = new Employee("happy", "griller", "Monday", 9.0, 24.0);
//                Employee griller = new Employee("MORNING", "fryer", "Tuesday", 9.0, 20.0);
//
//                // Call the instance methods
//                availability.sortByTime(hiren);
//                availability.sortByTime(divy);
//                availability.sortByTime(hel);
//                availability.sortByTime(griller);
//                
//                if(availability.fullDayShift.contains(hel.getName())) {
//                	System.out.println("true");
//                }
//                
//                else {
//                	System.out.println("no");
//                }
//
//                System.out.println("Morning Shift: " + availability.morningShift);
//                System.out.println("Full Day Shift: " + availability.fullDayShift);
//                System.out.println("Evening Shift: " + availability.eveningShift);
//            }
        }
