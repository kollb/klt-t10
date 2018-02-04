package main;

import bridge.M1;
import bridge.MicrowaveButton;

public class Application {
    public static void main(String[] args) {
        IMicrowave m1 = new M1();
        MicrowaveButton button = new MicrowaveButton(m1);
        button.setButtonControl(true);
        button.turnOn();
        button.turnOff();
    }

}
