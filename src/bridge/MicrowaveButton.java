package bridge;

import state.IButtonState;
import main.IMicrowave;

public class MicroWaveButton extends ButtonControl {
    private IMicrowave microwave;
    IButtonState state;

    public MicroWaveButton(IMicrowave microwave) {
        this.microwave = microwave;
    }

    public void click() {
        this.state=microwave.getState();
        state.click(microwave);
    }

    public void setState(IButtonState state) {
        microwave.setState(state);
    }
}
