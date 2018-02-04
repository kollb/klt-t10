package bridge;

import main.IMicrowave;

public class M1 implements IMicrowave {

    public void on() {
        System.out.println("M1 Microwave is turned on.");
    }

    public void off() {
        System.out.println("M1 Microwave is turned off.");
    }

    public void click() {
        System.out.println("M1 Microwave is turned off.");
    }
}
