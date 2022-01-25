
package application;
 
import java.util.Random;
 // Suggested solution
public class TemperatureSensor implements Sensor {
    private boolean on;
 
    @Override
    public boolean isOn() {
        return on;
    }
 
    @Override
    public void setOn() {
        on = true;
    }
 
    @Override
    public void setOff() {
        on = false;
    }
 
    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        Random rnd = new Random();
        return rnd.nextInt(61) - 30;
    }
}