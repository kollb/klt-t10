package state;

import main.IMicrowave;

public class TurnOff implements IButtonState {

    public void click(IMicrowave microwave) {
        System.out.println("Turned Microwave "+ microwave.getName() +" on");
        setState(microwave);
    }

    public void setState(IMicrowave microwave){
        microwave.setState(new TurnOn());
    }

}
