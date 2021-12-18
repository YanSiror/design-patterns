package proxyMode.staticProxy;

public class PersonProxy implements IPerson{
    private final  Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }


    @Override
    public void eat() {
        person.eat();
        System.out.println(person.toString());
    }

    @Override
    public void sleep() {
        person.sleep();
        System.out.println(person.toString());
    }
}
