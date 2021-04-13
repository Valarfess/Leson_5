package teach.me.skills.Class;

import teach.me.skills.War;
import teach.me.skills.abstractClass.Water;

public class Ship extends Water implements War {
    int passengerCapacy;
    String name;

    public Ship(int passengerCapacy, String name) {
        this.passengerCapacy = passengerCapacy;
        this.name = name;
    }

    @Override
    public void boom() {
        System.out.println("bam");
    }

    @Override
    public void fly() {
        System.out.println("no");
    }

    @Override
    public void move() {
        System.out.println("swim");
    }
}
