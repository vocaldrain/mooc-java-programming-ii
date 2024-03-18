/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chira
 */
public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<>();
    private List<Integer> allReadings = new ArrayList<>();

    @Override
    public boolean isOn() {
        if (sensors.isEmpty())
            return false;

        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                return false;
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!this.isOn() || sensors.isEmpty())
            throw new IllegalStateException("Average sensor is off or no sensors added.");

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int var =  sum / sensors.size();
        allReadings.add(var);
        return var;
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        
        if(sensors.isEmpty()){
            return new ArrayList<>();
        }
//        
//        for (Sensor sensor : sensors) {
//            allReadings.add(sensor.read());
//        }
        return allReadings;
    }
}