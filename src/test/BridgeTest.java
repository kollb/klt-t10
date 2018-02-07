package test;

import bridge.MicroWaveButton;
import main.IMicrowave;
import main.M1;
import org.junit.Assert;
import org.junit.Test;
import state.TurnOff;

public class BridgeTest {
    @Test
    public void doTestIfStateIsSet(){
        IMicrowave m1 = new M1();
        MicroWaveButton button = new MicroWaveButton(m1);
        button.setState(new TurnOff());
        Assert.assertNotNull(m1.getState());
        System.out.println(m1.getState());

    }
}
