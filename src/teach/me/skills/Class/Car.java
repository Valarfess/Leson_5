package teach.me.skills.Class;

import teach.me.skills.Civilian;
import teach.me.skills.abstractClass.Ground;

public class Car extends Ground implements Civilian {
    int valueWheel;
    int door;


    public Car(int valueWheel, int door) {
        this.valueWheel = valueWheel;
        this.door = door;
    }

    @Override
    public void move() {
        System.out.println("move slow");
    }

    @Override
    public void fly() {
        System.out.println("no");
    }
}
