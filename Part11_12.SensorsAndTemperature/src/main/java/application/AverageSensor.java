
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(sensor -> sensor.isOn() == true);
    }
    
    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }
    
    @Override
   public void setOff() {
       this.sensors.stream().forEach(sensor -> sensor.setOff());
    }
   
    @Override
   public int read() {
       if (isOn() == true) {
            int sum = this.sensors.stream().map(sensor -> sensor.read())
                    .reduce(0, (previousSum, value) -> previousSum + value);
            readings.add(sum/sensors.size());
            return sum/sensors.size();
            } else {        
            throw new IllegalStateException();
        }
   }
   
   public List<Integer> readings() {
       return readings;
    }
}

/*
Suggested solution:

    public List<Integer> readings() {
        return readings;
    }
 
    @Override
    public boolean isOn() {
        for (Sensor sensori : sensors) {
            if (sensori.isOn()) {
                return true;
            }
        }
 
        return false;
    }
 
    @Override
    public void setOn() {
        for (Sensor sensori : sensors) {
            sensori.setOn();
        }
    }
 
    @Override
    public void setOff() {
        for (Sensor sensori : sensors) {
            sensori.setOff();
        }
    }
 
    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
 
        int sum = 0;
        for (Sensor sensori : sensors) {
            sum += sensori.read();
        }
        int reading = sum / sensors.size();
 
        readings.add(reading);
 
        return reading;
    }
}
*/