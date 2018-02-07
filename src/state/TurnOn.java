package state;

import main.IMicrowave;

public class TurnOn implements IButtonState {

    public void click(IMicrowave microwave) {
        System.out.println("Turned Microwave "+ microwave.getName() +" off");
        setState(microwave);
    }

    public void clickTest(IMicrowave microwave) {
        System.out.println("Turned Microwave "+ microwave.getName() +" off");
        setState(microwave);
    }


    public void setState(IMicrowave microwave){
        microwave.setState(new TurnOff());
    }
}
