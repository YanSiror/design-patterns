package compositeMode.safeMode;

public class Employee extends People {

    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void check() {
        work();
    }
}
