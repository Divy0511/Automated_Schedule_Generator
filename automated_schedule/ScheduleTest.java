package automated_schedule;

import java.util.*;

public class ScheduleTest {
    public static void main(String[] args) {
        // Step 1: Create EmployeeRole and AvailabilityDay objects
        EmployeeRole employeeRole = new EmployeeRole();
        AvailabilityDay availabilityDay = new AvailabilityDay();
        Schedule schedule = new Schedule(availabilityDay, employeeRole);

        // Step 2: Create 15 individual Employee objects
        // 5 Full-time employees available all week
        for (String day : new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}) {
            availabilityDay.addAvailability(new Employee("Shail", "Fryer", day, "09:00 AM", "12:00 AM"));
            availabilityDay.addAvailability(new Employee("Devika", "Supervisor", day, "09:00 AM", "12:00 AM"));
            availabilityDay.addAvailability(new Employee("Sagar", "Supervisor", day, "09:00 AM", "12:00 AM"));
            availabilityDay.addAvailability(new Employee("Deep", "Supervisor", day, "09:00 AM", "12:00 AM"));
            availabilityDay.addAvailability(new Employee("Shnaya", "Supervisor", day, "09:00 AM", "12:00 AM"));
            availabilityDay.addAvailability(new Employee("Shania", "Supervisor", day, "09:00 AM", "12:00 AM"));
        }

        // Fryer (part-time)
        Employee divy = new Employee("Divy", "Fryer", "Monday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Divy", "Fryer", "Tuesday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Divy", "Fryer", "Thursday", "09:00 AM", "12:00 AM"));

        // Griller (part-time)
        Employee Hiren = new Employee("Hiren", "Griller", "Monday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Hiren", "Griller", "Tuesday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Hiren", "Griller", "Friday", "09:00 AM", "12:00 AM"));

        Employee Karan = new Employee("Karan", "Griller", "Tuesday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Karan", "Griller", "Wednesday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Karan", "Griller", "Saturday", "09:00 AM", "12:00 AM"));

        Employee Rajan = new Employee("Rajan", "Griller", "Tuesday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Rajan", "Griller", "Wednesday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Rajan", "Griller", "Sunday", "09:00 AM", "12:00 AM"));

        Employee Ian = new Employee("Ian", "Griller", "Wednesday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Ian", "Griller", "Thursday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Ian", "Griller", "Saturday", "09:00 AM", "12:00 AM"));

        // Cashier (part-time)
        Employee Mahek = new Employee("Mahek", "Cashier", "Thursday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Mahek", "Cashier", "Friday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Mahek", "Cashier", "Sunday", "09:00 AM", "12:00 AM"));

        Employee Mehr = new Employee("Mehr", "Cashier", "Thursday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Mehr", "Cashier", "Friday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Mehr", "Cashier", "Saturday", "09:00 AM", "12:00 AM"));

        Employee Jane = new Employee("Jane", "Cash ier", "Friday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Jane", "Cashier", "Saturday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Jane", "Cashier", "Sunday", "09:00 AM", "12:00 AM"));

        Employee Shreya = new Employee("Shreya", "Cashier", "Sunday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Shreya", "Cashier", "Monday", "09:00 AM", "12:00 AM"));

        // Supervisor (part-time)
        Employee Adish = new Employee("Adish", "Supervisor", "Monday", "09:00 AM", "12:00 AM");
        availabilityDay.addAvailability(new Employee("Adish", "Supervisor", "Wednesday", "09:00 AM", "12:00 AM"));
        availabilityDay.addAvailability(new Employee("Adish", "Supervisor", "Sunday", "09:00 AM", "12:00 AM"));

        Employee Murico = new Employee("Murico", "Supervisor", "Monday", "09:00 AM", "05:00 PM");
        availabilityDay.addAvailability(new Employee("Murico", "Supervisor", "Tuesday", "09:00 AM", "05:00 PM"));
        availabilityDay.addAvailability(new Employee("Murico", "Supervisor", "Saturday", "09:00 AM", "05:00 PM"));

        // Adding all employees to roles
        employeeRole.addEmployee("Shail", "Fryer");
        employeeRole.addEmployee("Devika", "Supervisor");
        employeeRole.addEmployee("Sagar", "Supervisor");
        employeeRole.addEmployee("Deep", "Supervisor");
        employeeRole.addEmployee("Shnaya", "Supervisor");
        employeeRole.addEmployee("Shania", "Supervisor");
        employeeRole.addEmployee("Divy", "Fryer");
        employeeRole.addEmployee("Hiren", "Griller");
        employeeRole.addEmployee("Karan", "Griller");
        employeeRole.addEmployee("Rajan", "Griller");
        employeeRole.addEmployee("Ian", "Griller");
        employeeRole.addEmployee("Mahek", "Cashier");
        employeeRole.addEmployee("Mehr", "Cashier");
        employeeRole.addEmployee("Jane", "Cashier");
        employeeRole.addEmployee("Shreya", "Cashier");
        employeeRole.addEmployee("Adish", "Supervisor");
        employeeRole.addEmployee("Murico", "Supervisor");

        // Step 5: Assign shifts for the week
        String[] shiftTimes = {
            "9:00 AM - 4:30 PM - Griller",
            "10:00 AM - 5:00 PM - Supervisor",
            "11:00 AM - 5:00 PM - Fryer",
            "11:00 AM - 5:00 PM - Cashier",
            "5:00 PM - 12:00 AM - Fryer",
            "5:00 PM - 12:00 AM - Cashier",
            "5:00 PM - 12:00 AM - Supervisor",
            "5:00 PM - 11:30 PM - Griller"
        };

        // Assign shifts to employees based on availability
        List<String> daysOfWeek = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        for (String day : daysOfWeek) {
            for (String shiftTime : shiftTimes) {
                String role = shiftTime.split(" - ")[2]; // Extract the role from the shift time
                schedule.assignToShift(shiftTime, role, day); // Assign employees to the shift
            }
        }

        // Step 6: Retrieve the full schedule
        Map<String, List<Employee>> fullSchedule = schedule.getFullSchedule();

        // Step 7: Display the schedule
        System.out.println("Weekly Schedule:");
        for (String day : daysOfWeek) {
            System.out.println("\n" + day + ":");
            for (int i = 0; i < shiftTimes.length; i++) {
                String shiftKey = shiftTimes[i];
                List<Employee> employees = fullSchedule.get(shiftKey);
                System.out.print("Shift " + (i + 1) + ": " + shiftKey + " - ");
                
                if (employees == null || employees.isEmpty()) {
                    System.out.println("No employees assigned.");
                } else {
                    // Randomly select an employee from the assigned list
                    Random random = new Random();
                    int randomIndex = random.nextInt(employees.size());
                    Employee randomEmployee = employees.get(randomIndex);
                    System.out.println(randomEmployee.getName() + " (" + randomEmployee.getPostion() + ")");
                }
            }
        }
    }
}