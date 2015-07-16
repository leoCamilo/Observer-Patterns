package app;

import cdp.AirCondition;
import cdp.StudantSensor;
import cdp.Thermometer;

public class Main {

    public static void main(String[] args) {
        AirCondition airCondition = new AirCondition();

        Thermometer thermometer_1 = new Thermometer();
        Thermometer thermometer_2 = new Thermometer();
        Thermometer thermometer_3 = new Thermometer();

        StudantSensor studantSensor_1 = new StudantSensor();
        StudantSensor studantSensor_2 = new StudantSensor();
        StudantSensor studantSensor_3 = new StudantSensor();

        thermometer_1.addObserver(airCondition);
        thermometer_2.addObserver(airCondition);
        thermometer_3.addObserver(airCondition);

        studantSensor_1.addObserver(airCondition);
        studantSensor_2.addObserver(airCondition);
        studantSensor_3.addObserver(airCondition);

        thermometer_1.setTemperature(20.3);
        thermometer_2.setTemperature(23.3);
        thermometer_3.setTemperature(25.3);

        studantSensor_1.setStudantCount(12);
        studantSensor_2.setStudantCount(22);
        studantSensor_3.setStudantCount(16);
    }
}
