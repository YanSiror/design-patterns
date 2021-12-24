package statePattern.stateWay;

public class User implements IUser,ISwitchState{
    IUser state = new Normal();

    @Override
    public void mockInterview() {
        state.mockInterview();
    }

    @Override
    public void purchasePlus() {
        state = new Plus();
    }

    @Override
    public void expire() {
        state = new Normal();
    }
}
