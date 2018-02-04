package bridge;

import main.IMicrowave;

public class M2 implements IMicrowave {
    @Override
    public void on() {
        System.out.println("M2 Microwave is turned on.");
    }

    @Override
    public void off() {
        System.out.println("M2 Microwave is turned off.");
    }

    @Override
    public void click() {

    }
}
