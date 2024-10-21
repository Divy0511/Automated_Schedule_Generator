package automated_schedule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Schedule {
    HashMap<String, String>[] TotalShifts = new HashMap[56];
    ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday" ,"Thrusday" ,"Friday" ,"Saturday" , "Sunday")); 
    Availability mondayAvailability = new Availability();
    Availability tuesdayAvailability = new Availability();
    Availability wednesdayAvailability = new Availability();
    Availability thursdayAvailability = new Availability();
    Availability fridayAvailability = new Availability();
    Availability saturdayAvailability = new Availability();
    Availability sundayAvailability = new Availability();
    Availability morningShift = new Availability();
    Availability eveningShift = new Availability();
    Availability fullDayShift = new Availability();

    
    
    
    
    
    public Schedule() {
        for (int i = 0; i < TotalShifts.length; i++) {
            TotalShifts[i] = new HashMap<>();
        }
        
        
        
    }

    public void shiftNumber() {
        for (int i = 0; i < TotalShifts.length; i++) {
            String key = "Shift" + ((i % 8) + 1);
            TotalShifts[i].put(key, ""); 
        }
    }

    
    public void shift1Name(){
    	
    	
    	  for (int i = 0; i < TotalShifts.length; i++) {
    	  }
    	  }
    
    
}
