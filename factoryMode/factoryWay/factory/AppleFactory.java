package factoryMode.factoryWay.factory;

import factoryMode.factoryWay.bean.Apple;
import factoryMode.factoryWay.bean.Fruit;

public class AppleFactory extends Fruit {
    public Fruit creat(String name){
        System.out.println("Apple Create");
        return new Apple(name);
    }
}
