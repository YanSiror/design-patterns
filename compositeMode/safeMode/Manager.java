package compositeMode.safeMode;

import java.util.ArrayList;
import java.util.List;

public class Manager extends People {
    // 管理的人员列表
    private List<People> people = new ArrayList<>();

    public Manager(String position, String job) {
        super(position, job);
    }

    public void addEmployee(People people) {
        this.people.add(people);
    }

    public void delEmployee(People people) {
        this.people.remove(people);
    }

    public void check() {
        for (People person : people) {
            person.work();
        }
    }
}
