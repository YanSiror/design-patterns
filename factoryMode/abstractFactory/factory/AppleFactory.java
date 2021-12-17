package factoryMode.abstractFactory.factory;


import factoryMode.abstractFactory.bean.Apple;
import factoryMode.abstractFactory.bean.Fruit;
import factoryMode.abstractFactory.bean.action.IFactory;

public class AppleFactory extends Fruit implements IFactory {

    @Override
    public Fruit create(String name) {
        System.out.println("Apple Create");
        return new Apple(name);
    }
}
