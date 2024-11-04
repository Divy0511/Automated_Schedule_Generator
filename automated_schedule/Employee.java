package automated_schedule;

public class Employee {
    private String name;
    private String day; // e.g., "Monday"
    private double startTime; // e.g., 9.0 for 9:00 AM
    private double endTime; // e.g., 17.0 for 5:00 PM
    private String position;
    
    
    
    public Employee() {
    	
    }
    
    	
 public Employee(Employee other) {
	 this.name = other.name;
     this.position = other.position;
     this.day = other.day;
     this.startTime = other.startTime;
     this.endTime = other.endTime;

    }
    

    public Employee(String name, String position, String day, double startTime, double endTime) {
        this.name = name;
        this.position = position;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return name + " (" + day + " from " + startTime + " to " + endTime + ")";
    }
}
