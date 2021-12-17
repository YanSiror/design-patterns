package compositeMode.transparentWay;

import java.util.ArrayList;
import java.util.List;

public class Manager extends People {
    // 管理的人员列表
    private List<People> people = new ArrayList<>();

    public Manager(String position, String job) {
        super(position, job);
    }

    @Override
    void addEmployee(People people) {
        this.people.add(people);
    }

    @Override
    void delEmployee(People people) {
        this.people.remove(people);
    }

    @Override
    void check() {
        work();
        for (People person : people) {
            person.check();
        }
    }
}
