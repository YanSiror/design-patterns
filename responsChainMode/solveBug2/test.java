package responsChainMode.solveBug2;

public class test {
    public static void main(String[] args) {
        Manager manager = new Manager();

        BUG easy = new BUG(20);
        BUG middle = new BUG(50);
        BUG hard = new BUG(100);

        manager.assignBug(easy);
        manager.assignBug(middle);
        manager.assignBug(hard);
    }
}
