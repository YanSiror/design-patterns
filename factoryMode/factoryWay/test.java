package factoryMode.factoryWay;

import factoryMode.factoryWay.bean.Fruit;
import factoryMode.factoryWay.factory.AppleFactory;

public class test {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.creat("apple");
        apple.getFruitName();
    }
}
