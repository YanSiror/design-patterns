package factoryMode.abstractFactory;

import factoryMode.abstractFactory.bean.Fruit;
import factoryMode.abstractFactory.bean.action.IFactory;
import factoryMode.abstractFactory.factory.AppleFactory;

public class test {
    public static void main(String[] args) {
        IFactory factory = new AppleFactory();
        Fruit apple = factory.create("apple");
        apple.getFruitName();
    }
}
