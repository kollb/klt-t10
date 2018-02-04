package bridge;

import main.IMicrowave;

public class MicrowaveButton extends ButtonControl {
    private boolean currentState;
    private boolean state;

    public MicrowaveButton(IMicrowave microwave) {
        super(microwave);
    }

    public void setButtonControl(boolean state){
        this.currentState = state;
    }

    public void pressButton(){
        if (currentState) setButtonControl(false);
            else setButtonControl(true);
    }



}
