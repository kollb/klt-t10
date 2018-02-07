package main;



import state.IButtonState;


public interface IMicrowave {
    String getName();
    void click();
    void setState(IButtonState state);
    IButtonState getState();


}
