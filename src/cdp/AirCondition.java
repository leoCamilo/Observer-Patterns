package cdp;

import java.util.Observable;
import java.util.Observer;

public class AirCondition implements Observer {
    private double temperature;
    private int studantCount;
    private int sensorTempCount = 0;
    private int sensorStudantCount = 0;
    private final int SENSOR_COUNT = 3;
    private double totalTemp;
    private double totalStudant;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Thermometer){
            Thermometer obj = (Thermometer) o;
            sensorTempCount++;
            totalTemp += obj.getTemperature();

            if (sensorTempCount == SENSOR_COUNT){
                sensorTempCount = 0;
                temperature = totalTemp/SENSOR_COUNT;
            }
        }

        if (o instanceof StudantSensor){
            StudantSensor obj = (StudantSensor) o;
            sensorStudantCount++;
            totalStudant += obj.getStudantCount();

            if (sensorStudantCount == SENSOR_COUNT){
                sensorStudantCount = 0;
                studantCount = (int) (totalStudant/SENSOR_COUNT);
            }
        }

        double tempTemperature = temperature + studantCount;
        System.out.println("temperatura natural: " + tempTemperature);
        System.out.println(String.format("compesado pelo ar-condicionado: %f", 25.0 - tempTemperature));
    }
}
