package responsChainMode.solveBug2;

public class Programmer {
    String type;    //程序员等级 菜鸟 普通 大神

    public Programmer(String type) {
        this.type = type;
    }

    public void solve(BUG bug) {
        System.out.println(type + "程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
