package factoryMode.factoryWay.factory;


import factoryMode.factoryWay.bean.Banana;
import factoryMode.factoryWay.bean.Fruit;

public class BananaFactory extends Fruit {
    public Fruit creat(String name){
        System.out.println("Banana Create");
        return new Banana(name);
    }
}
