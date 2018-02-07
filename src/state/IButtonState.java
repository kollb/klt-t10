package state;

import main.IMicrowave;

public interface IButtonState{

    void click(IMicrowave microwave);
    void setState(IMicrowave microwave);
}
