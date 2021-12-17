package compositeMode.transparentWay;

public class Employee extends People{

    public Employee(String position, String job) {
        super(position, job);
    }

    @Override
    void addEmployee(People people) {
        System.out.println("您的职位是"+this.position +",权限不足!");
    }

    @Override
    void delEmployee(People people) {
        System.out.println("您的职位是"+this.position +",权限不足!");
    }

    @Override
    void check() {
        work();
    }
}
