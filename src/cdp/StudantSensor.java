package cdp;

import java.util.Observable;

public class StudantSensor extends Observable{
    private int studantCount;

    public int getStudantCount() {
        return studantCount;
    }

    public void setStudantCount(int studantCount) {
        this.studantCount = studantCount;
        setChanged();
        notifyObservers();
    }
}
