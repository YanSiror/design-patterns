package factoryMode.factoryWay.factory;


import factoryMode.factoryWay.bean.Fruit;
import factoryMode.factoryWay.bean.Orange;

public class OrangeFactory extends Fruit {
    public Fruit creat(String name){
        System.out.println("Orange Create");
        return new Orange(name);
    }
}
