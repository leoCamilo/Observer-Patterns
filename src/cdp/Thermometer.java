package cdp;

import java.util.Observable;

public class Thermometer extends Observable {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers();
    }
}
