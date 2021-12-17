package factoryMode.abstractFactory.factory;


import factoryMode.abstractFactory.bean.Fruit;
import factoryMode.abstractFactory.bean.Orange;
import factoryMode.abstractFactory.bean.action.IFactory;

public class OrangeFactory extends Fruit implements IFactory {
    @Override
    public Fruit create(String name) {
        System.out.println("Orange Create");
        return new Orange(name);
    }
}
