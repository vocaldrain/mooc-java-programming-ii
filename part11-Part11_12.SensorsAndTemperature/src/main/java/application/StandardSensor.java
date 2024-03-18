
package application;
    

public class StandardSensor implements Sensor {
    private int value;

    public StandardSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true; // Standard sensor is always on
    }

    @Override
    public void setOn() {
        // No effect for standard sensor
    }

    @Override
    public void setOff() {
        // No effect for standard sensor
    }

    @Override
    public int read() {
        return value;
    }
}
