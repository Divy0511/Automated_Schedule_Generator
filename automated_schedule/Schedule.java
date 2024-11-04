package automated_schedule;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    ArrayList<String> days = new ArrayList<>(List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")); 

    // Availability and roles
    Availability availability = new Availability();
    EmployeeRole employeeRole = new EmployeeRole();

     ArrayList<String> mondayGriller = new ArrayList<>();

    public void addEmployeeToSchedule(Employee employee) {
        availability.sortByDay(employee);
        availability.sortByTime(employee);
        
        employeeRole.addEmployee(employee);
    }
    
    
    
 // Monday
    static ArrayList<String> mondayMorningGriller = new ArrayList<>();
    static ArrayList<String> mondayEveningGriller = new ArrayList<>();
    static ArrayList<String> mondayMorningFryer = new ArrayList<>();
    static ArrayList<String> mondayEveningFryer = new ArrayList<>();
    static ArrayList<String> mondayMorningCashier = new ArrayList<>();
    static ArrayList<String> mondayEveningCashier = new ArrayList<>();
    static ArrayList<String> mondayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> mondayEveningSupervisor = new ArrayList<>();

    public void MondayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.mondayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    mondayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    mondayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    mondayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    mondayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    mondayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    mondayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    mondayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    mondayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Tuesday
    static ArrayList<String> tuesdayMorningGriller = new ArrayList<>();
    static ArrayList<String> tuesdayEveningGriller = new ArrayList<>();
    static ArrayList<String> tuesdayMorningFryer = new ArrayList<>();
    static ArrayList<String> tuesdayEveningFryer = new ArrayList<>();
    static ArrayList<String> tuesdayMorningCashier = new ArrayList<>();
    static ArrayList<String> tuesdayEveningCashier = new ArrayList<>();
    static ArrayList<String> tuesdayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> tuesdayEveningSupervisor = new ArrayList<>();

    public void TuesdayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.tuesdayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    tuesdayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    tuesdayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    tuesdayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    tuesdayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    tuesdayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    tuesdayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    tuesdayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    tuesdayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Wednesday
    static ArrayList<String> wednesdayMorningGriller = new ArrayList<>();
    static ArrayList<String> wednesdayEveningGriller = new ArrayList<>();
    static ArrayList<String> wednesdayMorningFryer = new ArrayList<>();
    static ArrayList<String> wednesdayEveningFryer = new ArrayList<>();
    static ArrayList<String> wednesdayMorningCashier = new ArrayList<>();
    static ArrayList<String> wednesdayEveningCashier = new ArrayList<>();
    static ArrayList<String> wednesdayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> wednesdayEveningSupervisor = new ArrayList<>();

    public void WednesdayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.wednesdayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    wednesdayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    wednesdayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    wednesdayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    wednesdayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    wednesdayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    wednesdayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    wednesdayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    wednesdayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Thursday
    static ArrayList<String> thursdayMorningGriller = new ArrayList<>();
    static ArrayList<String> thursdayEveningGriller = new ArrayList<>();
    static ArrayList<String> thursdayMorningFryer = new ArrayList<>();
    static ArrayList<String> thursdayEveningFryer = new ArrayList<>();
    static ArrayList<String> thursdayMorningCashier = new ArrayList<>();
    static ArrayList<String> thursdayEveningCashier = new ArrayList<>();
    static ArrayList<String> thursdayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> thursdayEveningSupervisor = new ArrayList<>();

    public void ThursdayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.thursdayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    thursdayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    thursdayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    thursdayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    thursdayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    thursdayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    thursdayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    thursdayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    thursdayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Friday
    static ArrayList<String> fridayMorningGriller = new ArrayList<>();
    static ArrayList<String> fridayEveningGriller = new ArrayList<>();
    static ArrayList<String> fridayMorningFryer = new ArrayList<>();
    static ArrayList<String> fridayEveningFryer = new ArrayList<>();
    static ArrayList<String> fridayMorningCashier = new ArrayList<>();
    static ArrayList<String> fridayEveningCashier = new ArrayList<>();
    static ArrayList<String> fridayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> fridayEveningSupervisor = new ArrayList<>();

    public void FridayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.fridayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    fridayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    fridayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    fridayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    fridayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    fridayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    fridayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    fridayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    fridayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Saturday
    static ArrayList<String> saturdayMorningGriller = new ArrayList<>();
    static ArrayList<String> saturdayEveningGriller = new ArrayList<>();
    static ArrayList<String> saturdayMorningFryer = new ArrayList<>();
    static ArrayList<String> saturdayEveningFryer = new ArrayList<>();
    static ArrayList<String> saturdayMorningCashier = new ArrayList<>();
    static ArrayList<String> saturdayEveningCashier = new ArrayList<>();
    static ArrayList<String> saturdayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> saturdayEveningSupervisor = new ArrayList<>();

    public void SaturdayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.saturdayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    saturdayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    saturdayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    saturdayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    saturdayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    saturdayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    saturdayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    saturdayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    saturdayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    // Sunday
    static ArrayList<String> sundayMorningGriller = new ArrayList<>();
    static ArrayList<String> sundayEveningGriller = new ArrayList<>();
    static ArrayList<String> sundayMorningFryer = new ArrayList<>();
    static ArrayList<String> sundayEveningFryer = new ArrayList<>();
    static ArrayList<String> sundayMorningCashier = new ArrayList<>();
    static ArrayList<String> sundayEveningCashier = new ArrayList<>();
    static ArrayList<String> sundayMorningSupervisor = new ArrayList<>();
    static ArrayList<String> sundayEveningSupervisor = new ArrayList<>();

    public void SundayShifts(Employee employee) {
        String employeeName = employee.getName();

        if (Availability.sundayAvailability.contains(employeeName)) {
            if (Availability.morningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    sundayMorningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    sundayMorningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    sundayMorningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    sundayMorningSupervisor.add(employeeName);
                }
            }

            if (Availability.eveningShift.contains(employeeName) || Availability.fullDayShift.contains(employeeName)) {
                if (EmployeeRole.all_Grillers.contains(employeeName)) {
                    sundayEveningGriller.add(employeeName);
                } else if (EmployeeRole.all_Fryers.contains(employeeName)) {
                    sundayEveningFryer.add(employeeName);
                } else if (EmployeeRole.all_Cashiers.contains(employeeName)) {
                    sundayEveningCashier.add(employeeName);
                } else if (EmployeeRole.all_Supervisors.contains(employeeName)) {
                    sundayEveningSupervisor.add(employeeName);
                }
            }
        }
    }

    


    
    public static void main(String[] args) {
        // Create an instance of the scheduling class
        Schedule schedule = new Schedule();  // Assuming your class name is Schedule

        // Create Employee objects
        Employee hiren = new Employee("Hiren", "griller", "Monday", 9.0, 24.0);
        Employee divy = new Employee("Divy", "fryer", "Monday", 9.0, 24.0);
        Employee happy = new Employee("Happy", "cashier", "Monday", 9.0, 24.0);
        Employee dev = new Employee("Dev", "supervisor", "Monday", 9.0, 20.0);

        // New Monday Employee objects
        Employee employee1 = new Employee("Alice", "griller", "Monday", 9.0, 24.0);
        Employee employee2 = new Employee("Bob", "griller", "Monday", 17.0, 23.0);
        
        Employee employee3 = new Employee("Charlie", "fryer", "Monday", 9.0, 21.0);
        Employee employee4 = new Employee("David", "fryer", "Monday", 19.0, 24.0);
        
        Employee employee5 = new Employee("Eva", "cashier", "Monday", 9.0, 17.0);
        Employee employee6 = new Employee("Frank", "cashier", "Monday", 9.0, 12.0);
        
        Employee employee7 = new Employee("Grace", "supervisor", "Monday", 9.0, 16.0);
        Employee employee8 = new Employee("Hank", "supervisor", "Monday", 19.0, 24.0);

        // Add employees to the schedule
        schedule.addEmployeeToSchedule(hiren);
        schedule.addEmployeeToSchedule(divy);
        schedule.addEmployeeToSchedule(happy);
        schedule.addEmployeeToSchedule(dev);
        schedule.addEmployeeToSchedule(employee1);
        schedule.addEmployeeToSchedule(employee2);
        schedule.addEmployeeToSchedule(employee3);
        schedule.addEmployeeToSchedule(employee4);
        schedule.addEmployeeToSchedule(employee5);
        schedule.addEmployeeToSchedule(employee6);
        schedule.addEmployeeToSchedule(employee7);
        schedule.addEmployeeToSchedule(employee8);

        // Populate Monday shifts for the scheduled employees
        schedule.MondayShifts(hiren);
        schedule.MondayShifts(divy);
        schedule.MondayShifts(happy);
        
        schedule.MondayShifts(employee1);
        schedule.MondayShifts(employee2);
        schedule.MondayShifts(employee3);
        schedule.MondayShifts(employee4);
        schedule.MondayShifts(employee5);
        schedule.MondayShifts(employee6);
        schedule.MondayShifts(employee7);
        schedule.MondayShifts(employee8);

        // Print results
        System.out.println("Monday Morning Grillers: " + mondayMorningGriller);
        System.out.println("Monday Morning Fryers: " + mondayMorningFryer);
        System.out.println("Monday Morning Cashiers: " + mondayMorningCashier);
        System.out.println("Monday Morning Supervisors: " + mondayMorningSupervisor);

        
        
        
        System.out.println("Monday Evening Grillers: " + mondayEveningGriller);
        System.out.println("Monday Evening Fryers: " + mondayEveningFryer);
        System.out.println("Monday Evening Cashiers: " + mondayEveningCashier);
        System.out.println("Monday Evening Supervisors: " + mondayEveningSupervisor);
    }

    
    
}

