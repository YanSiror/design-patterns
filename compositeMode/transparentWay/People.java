package compositeMode.transparentWay;

public abstract class People {
    public String position;    //职位
    public String job;         //工作

    public People(String position, String job) {
        this.position = position;
        this.job = job;
    }

    //工作
    public void work(){
        System.out.println("我是"+position+",我的工作是"+job);
    }

    //管理者才有的权限操作
    abstract void addEmployee(People people);

    abstract void delEmployee(People people);

    abstract void check();
}
