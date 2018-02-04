package bridge;

import main.IMicrowave;

public abstract class ButtonControl {
    private IMicrowave microwave;

    public ButtonControl(IMicrowave microwave){
        this.microwave = microwave;
    }

    public void turnOn(){
        microwave.on();
    }

    public void turnOff(){
        microwave.off();
    }

    public void click(){
        microwave.click();
    }

}
