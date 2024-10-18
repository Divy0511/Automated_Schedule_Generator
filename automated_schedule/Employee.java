package automated_schedule;
//
public class Employee {
    private String name;
    private String day; // e.g., "Monday"
    private String startTime; // e.g., "09:00 AM"
    private String endTime; // e.g., "05:00 PM"
    private String postion;
    

	public Employee(String name, String postion,String day, String startTime, String endTime) {
        this.name = name;
        this.postion= postion;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    
	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return name + " (" + day + " from " + startTime + " to " + endTime + ")";
    }

    

	
}








