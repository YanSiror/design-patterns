package responsChainMode.solveBug3;

public class test {
    public static boolean handleBug(Programmer programmer, BUG bug) {
        if (programmer.type.equals("菜鸟") && bug.value > 0 && bug.value <= 20) {
            programmer.solve(bug);
            return true;
        } else if (programmer.type.equals("普通") && bug.value > 20 && bug.value <= 50) {
            programmer.solve(bug);
            return true;
        } else if (programmer.type.equals("优秀") && bug.value > 50 && bug.value <= 100) {
            programmer.solve(bug);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Programmer newbie = new Programmer("菜鸟");
        Programmer normal = new Programmer("普通");
        Programmer good = new Programmer("优秀");

        BUG easy = new BUG(20);
        BUG middle = new BUG(50);
        BUG hard = new BUG(100);

        // 链式传递责任
        if (!handleBug(newbie, easy)) {
            if (!handleBug(normal, easy)) {
                if (!handleBug(good, easy)) {
                    System.out.println("Kill the fake good programmer!");
                }
            }
        }

        if (!handleBug(newbie, middle)) {
            if (!handleBug(normal, middle)) {
                if (!handleBug(good, middle)) {
                    System.out.println("Kill the fake good programmer!");
                }
            }
        }

        if (!handleBug(newbie, hard)) {
            if (!handleBug(normal, hard)) {
                if (!handleBug(good, hard)) {
                    System.out.println("Kill the fake good programmer!");
                }
            }
        }
    }
}
