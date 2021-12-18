package proxyMode.staticProxy;

public class test {
    public static void main(String[] args) {
        Person person = new Person("张三","男");
        PersonProxy personProxy = new PersonProxy(person);
        //模拟观察 0 吃饭 1 睡觉
        int status = person.getStatus();
        if(status == 0)
            personProxy.eat();
        else
            personProxy.sleep();
    }
}
