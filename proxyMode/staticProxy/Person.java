package proxyMode.staticProxy;

public class Person implements IPerson{
    private String name;
    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person() {
    }

    public int getStatus(){
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("吃饭中!!!");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉中!!!");
    }
}
