package statePattern.baseWay;

public class MAIN {
    public static void main(String[] args) {
        User user= new User();
        user.mockInterview();

        //购买 PLUS 会员
        user.purchasePlus();
        user.mockInterview();
    }
}
