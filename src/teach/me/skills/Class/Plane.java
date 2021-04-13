package teach.me.skills.Class;

import teach.me.skills.War;
import teach.me.skills.abstractClass.Air;

public class Plane extends Air implements War {
    int passangerCapacy;
    int flyRange;

    public Plane(int passangerCapacy, int flyRange) {
        this.passangerCapacy = passangerCapacy;
        this.flyRange = flyRange;
    }

    @Override
    public void boom() {
        System.out.println("boom");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void move() {
        System.out.println("move hi");
    }

}
