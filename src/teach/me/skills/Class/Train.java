package teach.me.skills.Class;

import teach.me.skills.Civilian;
import teach.me.skills.abstractClass.Underground;

public class Train extends Underground implements Civilian {
    String name;
    int railWays;
    @Override
    public void move() {
        System.out.println("tu-tu");
    }

    @Override
    public void fly() {
        System.out.println("move hi-hi");
    }
}
