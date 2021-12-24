package statePattern.baseWay;

public class User implements IUser,ISwitchState {
    private State state = State.NORMAL;

    @Override
    public void purchasePlus() {
        state = State.PLUS;
    }

    @Override
    public void expire() {
        state = State.NORMAL;
    }

    @Override
    public void mockInterview() {
        if (state == State.PLUS) {
            System.out.println("开始模拟面试");
        } else {
            System.out.println("模拟面试是 Plus 会员专享功能");
        }
    }
}
