package responsChainMode.sloveBUG4;

public class ExcPro extends Programmer {
    @Override
    public void handle(BUG bug) {
        if (bug.value > 50 && bug.value <= 100) {
            solve(bug);
        } else if (next != null) {
            next.handle(bug);
        }
    }

    private void solve(BUG bug) {
        System.out.println("优秀程序员解决了一个难度为 " + bug.value + " 的 bug");
    }
}
