package main;


import bridge.ButtonControl;
import bridge.MicroWaveButton;
import state.TurnOff;
import state.TurnOn;


public class Application {
    public static void main(String[] args) {

        //Default State is TurnOff

        IMicrowave m1 = new M1();
        IMicrowave m2 = new M2();
        IMicrowave m3 = new M2();

        //Checking State DP Default State is TurnOff
        System.out.println("---- Checking State DP Default State is TurnOff -----");
        m1.setState(new TurnOff());
        m1.click();
        m1.click();
        System.out.println();
        //Checking State DP Setting State TurnOn
        System.out.println("---- Checking State DP Setting State TurnOn -----");
        m2.setState(new TurnOn());
        m2.click();
        m2.click();
        System.out.println();
        //Checking Bridge DP One Click Button
        System.out.println("---- Checking Bridge DP One Click Button Setting State TurnOff -----");
        MicroWaveButton button1 = new MicroWaveButton(m3);
        button1.setState(new TurnOff());
        button1.click();
        button1.click();
        button1.click();
    }

}
