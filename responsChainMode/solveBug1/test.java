package responsChainMode.solveBug1;

public class test {
    public static void handleBug(Programmer programmer, BUG bug) {
        if (programmer.type.equals("菜鸟") && bug.value > 0 && bug.value <= 20) {
            programmer.solve(bug);
        } else if (programmer.type.equals("普通") && bug.value > 20 && bug.value <= 50) {
            programmer.solve(bug);
        } else if (programmer.type.equals("优秀") && bug.value > 50 && bug.value <= 100) {
            programmer.solve(bug);
        }
    }

    public static void main(String[] args) {
        Programmer newbie = new Programmer("菜鸟");
        Programmer normal = new Programmer("普通");
        Programmer good = new Programmer("优秀");

        BUG easy = new BUG(20);
        BUG middle = new BUG(50);
        BUG hard = new BUG(100);

        // 依次尝试解决 bug
        handleBug(newbie, easy);
        handleBug(normal, easy);
        handleBug(good, easy);

        handleBug(newbie, middle);
        handleBug(normal, middle);
        handleBug(good, middle);

        handleBug(newbie, hard);
        handleBug(normal, hard);
        handleBug(good, hard);
    }
}
