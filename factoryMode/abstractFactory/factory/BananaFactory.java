package factoryMode.abstractFactory.factory;


import factoryMode.abstractFactory.bean.Banana;
import factoryMode.abstractFactory.bean.Fruit;
import factoryMode.abstractFactory.bean.action.IFactory;

public class BananaFactory extends Fruit implements IFactory {
    @Override
    public Fruit create(String name) {
        System.out.println("Banana Create");
        return new Banana(name);
    }
}
