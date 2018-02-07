package main;


import state.IButtonState;

public class M2 implements IMicrowave {
    IButtonState state;

    private String name = "M2";

    public String getName() {
        return name;
    }

    public void click() {
        state.click(this);
    }

    public void setState(IButtonState state) {
        this.state = state;
    }

    public IButtonState getState() {
        return state;
    }
}
